package arrays;

import java.util.Arrays;

public class RemoveOddIntegers {

	public static void main(String[] args) {
		int[] integers = { 2, 34, 55, 235, 544 };
		int countEven = 0;
		for (int i = 0; i < integers.length; i++) {
			if (integers[i] % 2 == 0) {
				countEven++;
			}
		}
		int[] evenIntegers = new int[countEven];
		int evenIntIndex = 0;
		for (int i = 0; i < integers.length; i++) {
			if (integers[i] % 2 == 0) {
				evenIntegers[evenIntIndex] = integers[i];
				evenIntIndex++;
			}
		}
		System.out.println(Arrays.toString(evenIntegers));
	}

}
