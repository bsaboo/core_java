package recursion;

public class PrintSubsequence {
	
	

	public static void main(String[] args) {
		String str = "aabcdeffg";
		int i = 0;
		printSubsequence(str, i, "");

	}

	private static void printSubsequence(String str, int i, String newstring) {
		
		if(i == str.length()) {
			System.out.println(newstring);
			return;
		}
		
		char currentChar = str.charAt(i);
		
		printSubsequence(str, i+1,newstring+currentChar);
		printSubsequence(str, i+1,newstring);

		
		
	}

}
