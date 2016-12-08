package com.ims;

import java.util.Map;
import java.util.Set;

import com.google.common.base.Charsets;
import com.google.common.base.Function;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;

public class SizeRestrictedMap {

    private static class ByteLimitedMap<K extends CharSequence, V extends CharSequence> extends ForwardingMap<K, V> {
        private final Map<K, V> m_delegate;
        private final int m_maxBytes;
        private int m_currentBytes = 0;

        public ByteLimitedMap(Map<K, V> delegate, int maxBytes)
        {
            m_delegate = delegate;
            m_maxBytes = maxBytes;
        }

        @Override
        protected Map<K, V> delegate() {
            return m_delegate;
        }

        @Override
        public V put(K key, V value) {
            int sizeInBytes = (getSize(key) + getSize(value));
            V previous = m_delegate.get(key);
            if (previous != null) {
                sizeInBytes -= (getSize(key) + getSize(previous));
            }

            ensureCapacity(sizeInBytes);
            m_delegate.put(key, value);
            m_currentBytes += sizeInBytes;

            return previous;
        }

        @Override
        public void putAll(Map<? extends K, ? extends V> map) {
            int sizeInBytes = 0;
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                sizeInBytes += (getSize(entry.getKey()) + getSize(entry.getValue()));
                V previous = m_delegate.get(entry.getKey());
                if (previous != null) {
                    sizeInBytes -= (getSize(entry.getKey()) + getSize(previous));
                }
            }

            ensureCapacity(sizeInBytes);
            m_delegate.putAll(map);
            m_currentBytes += sizeInBytes;
        }

        private void ensureCapacity(int sizeInBytes) {
            if ((m_currentBytes + sizeInBytes) > m_maxBytes) {
                throw new IllegalArgumentException("Not enough capacity to store item");
            }
        }

        @Override
        public V remove(Object object) {
            V removed = m_delegate.remove(object);

            if (removed != null) {
                int sizeInBytes = getSize((CharSequence)object) + getSize(removed);
                this.m_currentBytes -= sizeInBytes;
            }

            return removed;
        }

        // used to make each entry in entrySet immutable so that value can't be changed from underneath us
        private final Function<Map.Entry<K,V>, Map.Entry<K, V>> MAKE_ENTRY_IMMUTABLE = new Function<Map.Entry<K,V>, Map.Entry<K, V>>() {
            @Override
            public Map.Entry<K, V> apply(Map.Entry<K, V> entry) {
                return Maps.immutableEntry(entry.getKey(), entry.getValue());
            }
        };

        @Override
        public Set<java.util.Map.Entry<K, V>> entrySet() {
            return ImmutableSet.copyOf(Iterables.transform(m_delegate.entrySet(), MAKE_ENTRY_IMMUTABLE));
        }

        /**
         * This implementation is applicable to classes extending CharSequence. There is an assumption
         * that toString will be well defined for these classes and size limiting will be done on string
         * representation of the implementation.
         */
        private int getSize(CharSequence sequence) {
            return sequence == null ? 0 : sequence.toString().getBytes(Charsets.UTF_8).length;
        }
    }

    /**
     * Create a new map to impose limits on the total number of bytes that the map can hold.
     * Keys and values are both counted in this calculation.
     * For instance, a map created with a limit of 100 bytes will allow for storing a single key-value pair
     * where each is 50 bytes in length, or 10 pairs where each key and value are 5 bytes in length,
     * or any other feasible combination.
     *
     * Note: The returned map will not allow for any modifications to be done through the Set returned by the
     * entrySet() method, nor will it allow for value modification on the individual Map.Entry objects contained in that set.
     *
     * Note that the returned map is not synchronized, if concurrent updates will be performed the map must be synchonized
     * externally.
     *
     * @return Size limited hash map
     * @throws IllegalArgumentException if size would be exceeded on storing item.
     */
    public static <K extends CharSequence & Comparable<K>, V extends CharSequence> Map<K, V> newSizeRestrictedMap(int maxBytes) {
        return new ByteLimitedMap<>(Maps.<K, V>newHashMap(), maxBytes);
    }
}