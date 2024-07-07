package arrays;

public class Palindrome {

	public static void main(String[] args) {
		String word = "Madam";
		System.out.println(isPalindrome(word));

	}

	private static boolean isPalindrome(String word) {
		char[] arr = word.toLowerCase().toCharArray();
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			if (arr[start] != arr[end]) {
				return false;
			} else {
				start++;
				end--;
			}
		}
		return true;
	}

}
