package arrays;

import java.util.Scanner;

public class Findin2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rows = sc.nextInt();
		System.out.println("Enter no of cols");
		int cols = sc.nextInt();

		int[][] numbers = new int[rows][cols];
		System.out.println("Enter the entries below");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				numbers[i][j] = sc.nextInt();
			}
		}

		System.out.println("2D Array is shown below");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Enter the number to search");
		int search = sc.nextInt();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (numbers[i][j] == search)
					System.out.print("Found element at position:" + i + " " + j);

			}
		}

	}

}
