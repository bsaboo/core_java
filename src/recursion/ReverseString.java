package recursion;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Bansi";
		int index = str.length() - 1;
		reverseString(str, index);

	}

	private static void reverseString(String str, int index) {
		if (index == -1)
			return;

		System.out.println(str.charAt(index));
		reverseString(str, index - 1);

	}

}
