package arrays;

import java.util.Arrays;

public class SortDesc {

	public static void main(String[] args) {
		RandomArray randomarray = new RandomArray();
		int unsortedArray[] = randomarray.randomArray(5);
		System.out.println("Unsorted Array: " +Arrays.toString(unsortedArray));		
		
		int[] sortedArray = sortIntegers(new int[] {1,2,3});
		System.out.println("Sorted Array: " +Arrays.toString(sortedArray));		
	}
	private static int[] sortIntegers(int[] array) {
		int[] sortedArray = Arrays.copyOf(array,array.length);
		boolean flag = true;
		int temp;
		while(flag) {
			flag = false;
			for(int i = 0; i < sortedArray.length-1 ; i++) {
				if(sortedArray[i] < sortedArray[i+1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag = true;
					System.out.println(Arrays.toString(sortedArray));
				}
			}
		}
		return sortedArray;
	
	}
}
