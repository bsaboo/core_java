package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueusingCollection {

	public static void main(String[] args) {
		//Queue<Integer> queue = new LinkedList<>(); 
		Queue<Integer> queue = new ArrayDeque(); 

		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.remove();
		queue.add(7);
		queue.add(7);


		while (!queue.isEmpty()) {
			System.out.println(queue.peek());
			queue.remove();
		}


	}

}
