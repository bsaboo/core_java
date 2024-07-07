package arrays;

import java.util.Arrays;

public class Intro {
	public static void main(String[] args) {
		int[] arraylist = new int[10];
		arraylist[5] = 50;

		double[] doublearrylist = new double[10];
		doublearrylist[5] = 7;

		System.out.println(doublearrylist[5]);

		int[] initialzer = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(initialzer[4]);

		int length = initialzer.length;
		System.out.println(length);

		System.out.println(initialzer[initialzer.length - 1]);

		int[] newArray;
		newArray = new int[5];

		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = newArray.length - i;
		}

		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}

		for (int element : newArray) {
			System.out.println(element);
		}
		
		System.out.println(Arrays.toString(newArray));
		
		Object[] objectArray = new Object[5];
		objectArray[1]="Hello";
		
		System.out.println(Arrays.toString(objectArray));

	}
}
