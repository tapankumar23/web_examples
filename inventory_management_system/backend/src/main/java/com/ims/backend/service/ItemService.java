package com.ims.backend.service;

import java.util.List;

import com.ims.backend.model.Item;

public interface ItemService {

	List<Item> getAllItems();

	Item findByItemName(String itemName);

	Item save(Item item);
}
