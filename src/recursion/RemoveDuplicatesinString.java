package recursion;

public class RemoveDuplicatesinString {
	public static boolean[] map = new boolean[26];

	public static void main(String[] args) {
		String str = "abcbcb";
		removeduplciate(str, 0, "");
	}

	private static void removeduplciate(String str, int i, String newStr) {
		if (i == str.length()) {
			System.out.println(newStr);
			return;
		}
		if (map[str.charAt(i) - 'a'] == true) {
			removeduplciate(str, i + 1, newStr);
		} else {
			newStr += str.charAt(i);
			map[str.charAt(i) - 'a'] = true;
			removeduplciate(str, i + 1, newStr);

		}

	}

}
