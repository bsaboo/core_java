package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum {

	public static void main(String[] args) {
		int[] arrays = readIntegers();
		System.out.println(Arrays.toString(arrays));
		System.out.println("Minimum: " +findMin(arrays));
	}

	public static int findMin(int[] array) {
		int min;
		Arrays.sort(array);
		return array[0];
	}

	public static int[] readIntegers() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array");
		String entered = scanner.nextLine();
		String[] splits = entered.split(",");
		int[] values = new int[splits.length];
		
		for (int i = 0; i < splits.length; i++) {
			values[i] = Integer.parseInt(splits[i].trim());
		}
		return values;
	}

}
