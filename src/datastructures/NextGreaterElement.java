package datastructures;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		int[] nextGreaterElement = { 1, 2, 3, 4, 5 };

		int[] result = findNextGreaterElement(nextGreaterElement);
		System.out.println("Original Array : " + Arrays.toString(nextGreaterElement));
		System.out.println("Array with next greater value: " + Arrays.toString(result));

	}

	private static int[] findNextGreaterElement(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		int[] result = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() <= arr[i]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				result[i] = -1;
			} else {
				result[i] = stack.peek();
			}

			stack.push(arr[i]);
		}
		return result;

	}

}
