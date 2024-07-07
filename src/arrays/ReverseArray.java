package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arrays = readIntegers();
		System.out.println(Arrays.toString(arrays));
		//reverse(arrays);
		System.out.println(Arrays.toString(reverseCopy(arrays)));

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

	private static void reverse(int[] array) {
		int maxIndex = array.length - 1;
		int halfLength = array.length / 2;

		for (int i = 0; i < halfLength; i++) {
			int temp = array[i];
			array[i] = array[maxIndex - i];
			array[maxIndex - i] = temp;
		}
	}
	
	private static int[] reverseCopy(int[] array) {
		int[] reversedArray = new int[array.length];
		int maxIndex = array.length-1;
		for(int el : array) {
			reversedArray[maxIndex--]=el;
		}
		return reversedArray;
	}

}
