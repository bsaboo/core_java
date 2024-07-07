package datastructures;

public class CircularLinkedlist {

	private ListNode last;
	private int length;

	private class ListNode {
		private ListNode next;
		private int data;

		public ListNode(int data) {
			this.data = data;
		}
	}

	public CircularLinkedlist() {
		last = null;
		length = 0;
	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public void createCLL() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);

		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		last = fourth;
	}

	private void displayCLL() {
		if (last == null) {
			return;
		}
		ListNode first = last.next;
		while (first != last) {
			System.out.print(first.data + "-->");
			first = first.next;
		}
		System.out.println(first.data + "-->" + last.next.data);

	}

	public static void main(String[] args) {

		CircularLinkedlist circularLinkedlist = new CircularLinkedlist();
		circularLinkedlist.createCLL();
		circularLinkedlist.displayCLL();

		circularLinkedlist.insertFirst(10);
		circularLinkedlist.displayCLL();

	}

	private void insertFirst(int value) {

		ListNode newNode = new ListNode(value);
		if (last == null) {
			newNode = last;
		} else {
			newNode.next = last.next;
		}
		last.next = newNode;
		length++;

	}

}
