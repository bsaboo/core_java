package datastructures;

import java.util.Stack;

public class ValidStrings {

	public static void main(String[] args) {
		String str1 = "()";
		String str2 = "[]}";

		System.out.println("String 1 " + str1 + " is : " + (checkString(str1) ? " is valid" : " not valid"));
		System.out.println("String 2 " + str2 + " is : " + (checkString(str2) ? " is valid" : " not valid"));

	}

	private static boolean checkString(String str) {

		Stack<Character> stack = new Stack<>();
		for (char c : str.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				} else {
					char top = stack.peek();
					if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
						stack.pop();
					} else {
						return false;
					}
				}
			}
		}

		return stack.isEmpty();
	}

}
