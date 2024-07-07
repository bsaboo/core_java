package recursion;

import java.util.HashSet;

public class UniqueSubsequence {

	public static void main(String[] args) {
		String str = "aaaaa";
		int i = 0;
		HashSet<String> set = new HashSet<>();
		printSubsequence(str, i, "", set);

	}

	private static void printSubsequence(String str, int i, String newstring, HashSet<String> set) {

		if (i == str.length()) {
			if (set.contains(newstring)) {
				return;
			} else {
				System.out.println(newstring);
				set.add(newstring);
				return;
			}

		}

		char currentChar = str.charAt(i);

		printSubsequence(str, i + 1, newstring + currentChar, set);
		printSubsequence(str, i + 1, newstring, set);

	}

}
