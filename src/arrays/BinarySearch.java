package arrays;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		String[] stringArray = new String[] { "Bansi", "Saboo" };
		Arrays.sort(stringArray);
		System.out.println(Arrays.toString((stringArray)));
		if (Arrays.binarySearch(stringArray, "Bansi") >= 0) {
			System.out.println("Found");
			System.out.println();
		}
		
		int[] s1 = {1,2,3,4,5};
		int[] s2 = {1,2,3,4,5};
		
		if(Arrays.equals(s1, s2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}
	}

}
