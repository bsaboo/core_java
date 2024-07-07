package datastructures;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 20, 10, 30, 40, 60 };
		int[] newArr = selectionSort(arr);
		System.out.println(Arrays.toString(newArr));

	}

	private static int[] selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

		return arr;
	}

}
