package datastructures;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

	private ListNode head;
	private ListNode tail;
	private int length;

	private class ListNode {
		private int data;
		private ListNode next;
		private ListNode previous;

		public ListNode(int data) {
			this.data = data;
		}
	}

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public int length() {
		return length;
	}

	public static void main(String[] args) {
		DoublyLinkedList dll1 = new DoublyLinkedList();
		DoublyLinkedList dll2 = new DoublyLinkedList();

		dll1.insertFirst(2);
		dll1.insertFirst(5);

		dll2.insertLast(1);
		dll2.insertLast(6);

		System.out.println(" ------ List 1 ----- ");
		dll1.displayFront();
		dll1.displayBack();

		System.out.println(" ------ List 2 ----- ");
		dll2.displayFront();
		dll2.displayBack();

		System.out.println(" --- Delete first from list1 & delete last from list2 ---");
		dll1.deleteFirst();
		dll1.displayFront();

		dll2.deleteLast();
		dll2.displayFront();
	}

	private ListNode deleteLast() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		ListNode temp = tail;
		if (head == tail) {
			head = null;
		} else {
			tail.previous.next = null;
		}
		tail = tail.previous;
		temp.previous = null;
		return temp;
	}

	private ListNode deleteFirst() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		ListNode temp = head;
		if (head == tail) {
			tail = null;
		} else {
			head.next.previous = null;
			head = head.next;
			temp.next = null;
			length--;
		}
		return temp;
	}

	private void displayBack() {
		ListNode temp = tail;
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.previous;
		}
		System.out.println("null");
	}

	private void displayFront() {
		ListNode temp = head;

		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	private void insertFirst(int value) {
		ListNode listNode = new ListNode(value);
		if (isEmpty()) {
			tail = listNode;
		} else {
			head.previous = listNode;
		}
		listNode.next = head;
		head = listNode;
		length++;
	}

	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if (isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
		}
		tail = newNode;
		length++;
	}
}