package datastructures;

import java.util.PriorityQueue;

class Price {
	String itemName;
	int price;
	String timestamp;
	int priority;

	public Price(String itemName, int price, String timestamp, int priority) {
		this.itemName = itemName;
		this.price = price;
		this.timestamp = timestamp;
		this.priority = priority;
	}
}

public class Demo {

	public static void main(String[] args) {
		// Simulate continuous stream processing for demonstration
		simulateContinuousStream();
	}

	public static void simulateContinuousStream() {
		PriorityQueue<Price> priceQueue = new PriorityQueue<>((p1, p2) -> {
			if (p1.priority != p2.priority) {
				return Integer.compare(p1.priority, p2.priority);
			} else {
				return p1.timestamp.compareTo(p2.timestamp);
			}
		});

		// Simulating continuous stream data for a certain duration
		// Stream 1
		priceQueue.offer(new Price("InstaPot", 100, "10:00 a.m.", 1));
		priceQueue.offer(new Price("Bose headphones", 200, "10:10 a.m.", 1));

		// Stream 2
		priceQueue.offer(new Price("USBCable", 10, "10:00 a.m.", 2));
		priceQueue.offer(new Price("Charger", 5, "10:05 a.m.", 2));

		// Processing continuous stream
		while (!priceQueue.isEmpty()) {
			Price price = priceQueue.poll();
			System.out.println("[" + price.itemName + ", " + price.price + ", " + price.timestamp + "]");
		}
	}
}