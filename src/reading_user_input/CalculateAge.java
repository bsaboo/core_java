package reading_user_input;

import java.util.Scanner;

public class CalculateAge {

	public static void main(String[] args) {
		int currentYear = 2022;
		/*
		 * String birthYear = "1996";
		 * 
		 * int dob = currentYear - Integer.parseInt(birthYear); System.out.println(dob);
		 */
		try {
			System.out.println(getInputFromConsole(currentYear));
		} catch (NullPointerException e) {
			System.out.println("For input from console Trying running manually in console");
		}
		System.out.println("Running using input from scanner");
		System.out.println(getInputFromScanner(currentYear));
	}

	public static String getInputFromConsole(int currentYear) {

		String name = System.console().readLine("Name");
		System.out.println("Hi" + name);
		String birthYear = System.console().readLine("Birth Year");
		int dob = currentYear - Integer.parseInt(birthYear);
		return name + " is " + dob + " years old";

	}

	public static String getInputFromScanner(int currentYear) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Name?");
		String name = scanner.nextLine();
		boolean validData = false;
		int age = 0;
		do {
			System.out.println("Birth Year >=" + (currentYear - 125) + "<=" + (currentYear));
			try {
				age = checkData(currentYear, scanner.nextLine());
				validData = age < 0 ? false : true;
			} catch (NumberFormatException e) {
				System.out.println("Enter valid date");
			}
		} while (!validData);

		return name + " is " + age + " years old";
	}

	public static int checkData(int currentYear, String birthYear) {
		int dob = Integer.parseInt(birthYear);
		int minYear = currentYear - 125;

		if ((dob < minYear) || (dob > currentYear)) {
			return -1;
		}
		return currentYear - dob;
	}

}
