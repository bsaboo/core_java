package datastructures;

import java.util.Arrays;

public class StackusingArrays {

	private static int[] arr;
	private int top;

	public StackusingArrays(int capacity) {
		arr = new int[capacity];
		top = -1;
	}

	public void push(int data) {
		if (isFull()) {
			throw new RuntimeException("Stack is full");
		}
		top++;
		arr[top] = data;
	}

	private int size() {
		return top + 1;
	}

	private boolean isFull() {
		return arr.length == size();
	}

	private static void printStack() {
		if (arr.length != 0) {
			System.out.println(Arrays.toString(arr));
		}
	}

	private int pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty!!");
		}
		int result = arr[top];
		top--;
		return result;
	}

	private boolean isEmpty() {
		return top < 0;
	}

	private int peek() {
		if (isEmpty())
			throw new RuntimeException("Stack is empty");
		return arr[top];
	}

	public static void main(String[] args) {
		StackusingArrays stack1 = new StackusingArrays(3);
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.pop();
		stack1.pop();
		System.out.println("Peek element is: " + stack1.peek() );
		printStack();
	}

}
