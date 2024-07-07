package arrays;

import java.util.Arrays;

public class MoveAllZerostoEnd {
	public static void main(String[] args) {
		int[] arr = { 0, 7, 0, 8, 3, 0, 8, 5, 0, 4 };
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if (arr[j] != 0) {
				j++;
			}
		}

		System.out.println(Arrays.toString(arr));

		int[] arr2 = { 0, 7, 0, 8, 3, 0, 8, 5, 0, 4 };
		int k = arr2.length-1;

		for (int i = k; i >= 0; i--) {
            if (arr2[i] != 0) {
                // Move non-zero element to the end
            	arr2[k--] = arr2[i];
            }
        }

        // Fill the beginning of the array with zeros
        while (k >= 0) {
            arr2[k--] = 0;
        }

			System.out.println(Arrays.toString(arr2));
	}

}
