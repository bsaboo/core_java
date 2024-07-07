package datastructures;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 5, 1, 9, 2, 10 };
		int[] newArr = insertionSort(arr);
		System.out.println(Arrays.toString(newArr));

	}

	private static int[] insertionSort(int[] arr) {
		int n = arr.length - 1;
		for (int i = 1; i < n; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;

		}
		return arr;
	}

}
