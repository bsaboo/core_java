package datastructures;

public class SumTwoNumbers {

	private ListNode head;

	private static class ListNode {

		int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print("null");
		System.out.println("");

	}

	public static void main(String[] args) {

		SumTwoNumbers list1 = new SumTwoNumbers();
		list1.head = new ListNode(5);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(9);
		ListNode fourth = new ListNode(10);

		list1.head.next = second; // 10 --> 6
		second.next = third; // 6 --> 4
		third.next = fourth;

		SumTwoNumbers list2 = new SumTwoNumbers();
		list2.head = new ListNode(1);
		ListNode list2second = new ListNode(2);
		ListNode list2third = new ListNode(3);

		list2.head.next = list2second; // 10 --> 6
		list2second.next = list2third; // 6 --> 4
		

		list1.display();
		list2.display();

		SumTwoNumbers result = new SumTwoNumbers();
		result.head = merge(list1.head, list2.head);

		result.display();

	}

	private static ListNode merge(ListNode a, ListNode b) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;

		while (a != null && b != null) {
			if (a.data <= b.data) {
				tail.next = a;
				a = a.next;
			} else {
				tail.next = b;
				b = b.next;
			}
			tail = tail.next;
		}
		if (a == null) {
			tail.next = b;
		} else {
			tail.next = a;
		}

		return dummy.next;
	}

}
