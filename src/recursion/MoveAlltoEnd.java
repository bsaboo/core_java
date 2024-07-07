package recursion;

public class MoveAlltoEnd {

	public static void main(String[] args) {
		String str = "abcxxbc";
		String newStr = "";
		movetoEnd(str, 0, 0, newStr);
		System.out.println(newStr);

	}

	private static void movetoEnd(String str, int i, int count, String newStr) {
		if (i == str.length()) {

			for (int j = 0; j < count; j++) {
				newStr = newStr + 'x';
			}
			System.out.println(newStr);

			return;
		}

		if (str.charAt(i) == 'x') {
			count++;
			movetoEnd(str, i + 1, count, newStr);
		} else {
			newStr = newStr + str.charAt(i);
			movetoEnd(str, i + 1, count, newStr);

		}

	}

}
