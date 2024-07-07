package datastructures;

import java.util.Arrays;

//Time Complxity - O(n^2)
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 20, 10, 30, 40, 60 };
		int[] newArr = bubbleSort(arr);
		System.out.println(Arrays.toString(newArr));

	}

	private static int[] bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;

	}

}
