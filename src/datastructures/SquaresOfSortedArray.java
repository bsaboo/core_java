package datastructures;

import java.util.Arrays;

public class SquaresOfSortedArray {

	public static void main(String[] args) {
		int[] arr = { -20, -10, 0, 4, 6 };
		int[] newArr = square(arr);
		System.out.println(Arrays.toString(newArr));

	}

	private static int[] square(int[] arr) {
		int n = arr.length;
		int[] result = new int[n];
		int i = 0;
		int j = n - 1;

		for (int k = n - 1; k >= 0; k--) {
			if (Math.abs(arr[i]) > Math.abs(j)) {
				result[k] = arr[i] * arr[i];
				i++;
			} else {
				result[k] = arr[j] * arr[j];
				j--;
			}
		}
		return result;
	}
}
