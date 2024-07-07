package recursion;

public class FirstLastOccinString {

	public static void main(String[] args) {
		String str = "bcb";
		int first = -1;
		int last = -1;
		char element = 'b';
		int i = 0;

		findOccu(first, last, element, str, i);

	}

	private static void findOccu(int first, int last, char element, String str, int i) {
		if (i == str.length()) {
			System.out.println("First : " + first + "Last : " + last);
			return;
		}
		if (str.charAt(i) == element) {
			if (first == -1) {
				first = i;
			} else
				last = i;
		}
		findOccu(first, last, element, str, i + 1);

	}

}
