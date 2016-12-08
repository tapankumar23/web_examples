package com.ims.backend;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {
	public static void main1(String[] args) {
		List<Integer> taskQueue = new ArrayList<Integer>();
		int MAX_CAPACITY = 5;
		Thread tProducer = new Thread(new Producer(taskQueue, MAX_CAPACITY), "Producer");
		Thread tConsumer = new Thread(new Consumer(taskQueue), "Consumer");
		tProducer.start();
		tConsumer.start();
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		
		class Producer extends Thread {
			{this.setName("Producer");}
			public void run() {
				for(int i=0; i < 5;i++) {
					System.out.println(Thread.currentThread().getName()+" is running !! "+i);
					//Thread.yield();
				}
			}
		}
		
		class Consumer extends Thread {
			{this.setName("Consumer");}
			public void run() {
				for(int i=0; i < 5;i++) {
					System.out.println(Thread.currentThread().getName()+" is running !! "+i);
					//Thread.yield();
				}
			}
		}
		Producer producer = new Producer();
		producer.setPriority(Thread.MAX_PRIORITY);
		
		Consumer consumer = new Consumer();
		consumer.setPriority(Thread.MIN_PRIORITY);
		
		producer.start();
		consumer.start();
		System.out.println("End");
	}
}

class Producer implements Runnable {

	private final List<Integer> taskQueue;
	private final int MAX_CAPACITY;

	public Producer(List<Integer> sharedQueue, int size) {
		this.taskQueue = sharedQueue;
		this.MAX_CAPACITY = size;
	}

	@Override
	public void run() {
		int counter = 0;
		while (true) {
			try {
				produce(counter++);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	private void produce(int i) throws InterruptedException {
		synchronized (taskQueue) {
			while (taskQueue.size() == MAX_CAPACITY) {
				System.out.println("Queue is full " + Thread.currentThread().getName() + " is waiting , size: " + taskQueue.size());
				System.out.println(Thread.currentThread().getName() +" will wait now !!!! ");
				taskQueue.wait();
			}

			Thread.sleep(1000);
			taskQueue.add(i);
			System.out.println("Produced: " + i);
			taskQueue.notifyAll();
		}
	}
}

class Consumer implements Runnable {

	private final List<Integer> taskQueue;

	public Consumer(List<Integer> sharedQueue) {
		this.taskQueue = sharedQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				consume();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	private void consume() throws InterruptedException {
		synchronized (taskQueue) {
			while (taskQueue.isEmpty()) {
				System.out.println("Queue is empty " + Thread.currentThread().getName() + " is waiting , size: " + taskQueue.size());
				System.out.println(Thread.currentThread().getName() +" will wait now !!!! ");
				taskQueue.wait();
			}

			Thread.sleep(1000);
			int i = taskQueue.remove(0);
			System.out.println("Consumed: " + i);
			taskQueue.notifyAll();
		}
	}
}
