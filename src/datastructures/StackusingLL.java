package datastructures;

public class StackusingLL {

	private ListNode top;
	private int length;

	private static class ListNode {
		int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public StackusingLL() {
		top = null;
		length = 0;
	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public void push(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = top;
		top = newNode;
		length++;
	}

	public int pop() {
		int result = top.data;
		top = top.next;
		length--;
		return result;

	}

	private void display() {
		if (top == null) {
			return;
		} else {
			ListNode temp = top;
			while (temp != null) {
				System.out.print(temp.data + "-->");
				temp = temp.next;
			}
			System.out.println("null");
		}
	}

	public static void main(String[] args) {
		StackusingLL stack = new StackusingLL();
		stack.push(2);
		stack.push(1);
		System.out.println("Item pushed");
		stack.display();

		System.out.println("Item popped: " + stack.pop());

		stack.display();
	}

}
