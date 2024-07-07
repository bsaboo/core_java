package datastructures;

public class StringEncoding {

	public static void main(String[] args) {
		String str = "abbccccc";
		StringBuilder newStr = decoding(str);
		System.out.println(newStr.toString());

	}

	private static StringBuilder decoding(String str) {
		StringBuilder newString = new StringBuilder();
		char[] input = str.toCharArray();
		char prev = 0;
		int count = 0;

		for (char c : input) {
			if (c == prev) {
				count++;
			} else {
				if (prev != 0)
					newString.append(count).append(prev);
				prev = c;
				count = 1;
			}
		}

		newString.append(count).append(prev);
		return newString;
	}
}
