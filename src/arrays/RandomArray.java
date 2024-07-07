package arrays;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {

	public static void main(String[] args) {

		int[] randowmarray = randomArray(10);
		System.out.println(Arrays.toString(randowmarray));
		Arrays.sort(randowmarray);
		System.out.println(Arrays.toString(randowmarray));

		int[] secondArray = new int[10];
		Arrays.fill(secondArray, 5);
		System.out.println(Arrays.toString(secondArray));

		int[] thirdArray = Arrays.copyOf(randowmarray, 20);
		Arrays.sort(thirdArray);
		System.out.println(Arrays.toString(thirdArray));

		int[] smallArray = Arrays.copyOf(thirdArray, 5);
		System.out.println(Arrays.toString(smallArray));

		Arrays.sort(smallArray, smallArray.length - 1, 0);

	}

	public static int[] randomArray(int len) {
		Random random = new Random();
		int[] newInt = new int[len];
		for (int i = 0; i < len; i++) {
			newInt[i] = random.nextInt(100);
		}
		return newInt;
	}

}
