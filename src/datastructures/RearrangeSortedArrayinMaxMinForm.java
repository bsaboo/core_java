package datastructures;

import java.util.Arrays;

public class RearrangeSortedArrayinMaxMinForm {

	public static void main(String[] args) {
		int[] arr = { 8, 10, 11, 14, 16 };
		int[] newArr = rearrange(arr);
		System.out.println(Arrays.toString(newArr));

	}

	private static int[] rearrange(int[] arr) {

		int minIndx = 0;
		int maxIndx = arr.length - 1;
		int max = arr[maxIndx] + 1;

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				arr[i] = arr[i] + (arr[maxIndx] % max) * max;
				maxIndx--;
			} else {
				arr[i] = arr[i] + (arr[minIndx] % max) * max;
				minIndx++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] / max;
		}
		return arr;
	}

}
