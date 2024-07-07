package strings;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		String firstName = "Bansi";
		String lastName = "Saboo";
		String fullName = "Bansi Saboo";
		String sentence = "My name is Bansi Saboo";

		Scanner sc = new Scanner(System.in);
		// String input = sc.nextLine();
		// System.out.println("You have entered " + input);

		System.out.println(firstName.concat(lastName));

		for (int i = 0; i < firstName.length(); i++) {
			System.out.println(firstName.charAt(i));
		}

		// Don't use == use compareto
		if (firstName.compareTo(lastName) == 0) {
			System.out.println("String are equal");
		} else {
			System.out.println("String are not equal");
		}

		String name = fullName.substring(5);
		System.out.println(name);
	}

}
