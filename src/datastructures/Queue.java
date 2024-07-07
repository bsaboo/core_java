package datastructures;

import java.util.NoSuchElementException;

public class Queue {

	private ListNode front;
	private ListNode rear;
	private int length;

	private class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	private void enqueue(int data) {
		ListNode temp = new ListNode(data);
		if (isEmpty()) {
			front = temp;
		} else {
			rear.next = temp;
		}
		rear = temp;
		length++;
	}

	private void dequeue() {

		if (isEmpty()) {
			throw new NoSuchElementException("Queue is empty");
		} else {
			front = front.next;
			if (front == null) {
				rear = null;
			}
			length--;
		}

	}

	private int front() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is empty");
		}
		return front.data;
	}

	private int rear() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is empty");
		}
		return rear.data;
	}

	private void printQueue() {

		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			ListNode current = front;

			while (current != null) {
				System.out.print(current.data + "-->");
				current = current.next;
			}
			System.out.println("null");
		}

	}

	public static void main(String[] args) {
		Queue queue = new Queue();

		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);

		queue.dequeue();

		queue.printQueue();
		System.out.println("Front: " + queue.front());
		System.out.println("Rear: " + queue.rear());

	}

}
