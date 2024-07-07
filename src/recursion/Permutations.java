package recursion;

public class Permutations {

	public static void main(String[] args) {
		String str = "abc";
		int index = 0;
		permute(str, "");

	}

	private static void permute(String str, String permute) {

		if (str.length() == 0) {
			System.out.println(permute);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char currChar = str.charAt(i);
			String newStr = str.substring(0, i) + str.substring(i + 1);
			permute(newStr, permute + currChar);
		}

	}

}
