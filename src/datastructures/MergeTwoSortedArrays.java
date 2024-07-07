package datastructures;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = {0, 0, 0, 20, 10, 30, 40, 60};
		int[] arr2 = { 1, 2, 3, 4, 5 };
		int[] newArr = merge(arr1, arr2);
		System.out.println(Arrays.toString(newArr));

	}

	private static int[] merge(int[] arr1, int[] arr2) {
		int[] newArr = new int[arr1.length + arr2.length];
		int m = arr1.length;
		int n = arr2.length;
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < m && j < n) {
			if (arr1[i] < arr2[j]) {
				newArr[k] = arr1[i];
				i++;
			} else {
				newArr[k] = arr2[j];
				j++;
			}
			k++;
		}

		while (i < m) {
			newArr[k] = arr1[i];
			i++;

			k++;
		}
		while(j < n) {
			newArr[k] = arr2[j];
			j++;
			k++;
			
		}

		return newArr;
	}

}
