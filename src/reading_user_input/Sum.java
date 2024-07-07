package reading_user_input;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		System.out.println("Enter five numbers");
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count=1;
		while(count <= 5) {
			int num;
			try {
				System.out.println("Enter num#" +count);
				num = Integer.parseInt(scanner.nextLine());
				sum  = sum + num;
				count++;
			} catch (NumberFormatException e) {
				System.out.println("Enter digit!!");
			}
		}
		System.out.println("Sum:" +sum);
	}

	public static void checkIfNumberValid() {

	}

}
