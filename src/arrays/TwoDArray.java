package arrays;

import java.util.Arrays;

public class TwoDArray {
	public static void main(String[] args) {
		int[][] array2 = new int[4][4];
		for(int[] outer : array2) {
			System.out.println(Arrays.toString(outer));
		}
		
		for(int i=0;i<array2.length;i++) {
			for(int j=0; j<array2[i].length;j++) {
				System.out.print(array2[i][j] +" ");
			}
			System.out.println();
		}
		
		for(var outer: array2) {
			for(var element: outer) {
				System.out.print(element +" ");
			}
			System.out.println();

		}
		
		System.out.println(Arrays.deepToString(array2));
	}
}
