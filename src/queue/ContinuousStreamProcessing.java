package queue;

import java.util.PriorityQueue;

public class ContinuousStreamProcessing {
	
	public static class Price{
		String itemName;
		int price;
		String timestamp;
		int priority;
		
		public Price(String itemName, int price, String timestamp, int priority) {
			this.itemName = itemName;
			this.price= price;
			this.timestamp = timestamp;
			this.priority = priority;
		}
	}

	public static void main(String[] args) {
		simulateContinousStream();

	}

	private static void simulateContinousStream() {
		PriorityQueue<Price> pq = new PriorityQueue<>((p1,p2)->{
			if(p1.priority != p2.priority) {
				return Integer.compare(p1.priority, p2.priority);
			}else {
				return p1.timestamp.compareTo(p2.timestamp);
			}
		});
		
		pq.offer(new Price("Instapot",100,"10:00 a.m.",1));
		pq.offer(new Price("Bose headphones",200,"10:10 a.m.",1));
		
		pq.offer(new Price("USBCable",10,"10:00 a.m.",2));
		pq.offer(new Price("Charger",5,"10:05 a.m.",2));

		
		while(!pq.isEmpty()) {
			Price price = pq.poll();
            System.out.println("[" + price.itemName + ", " + price.price + ", " + price.timestamp + "]");
		}
	}

}
