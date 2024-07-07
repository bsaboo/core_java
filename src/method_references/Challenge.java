package method_references;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class Challenge {

	private static Random random = new Random();

	private record Person(String first) {
		public String last(String s) {
			return first + " " +s.substring(0,s.indexOf(" "));
		}
	}

	public static void main(String[] args) {
		String[] names = { "BaNsi", "PRINCE", "Bob" };
		Person person = new Person("FirstName");
		List<UnaryOperator<String>> list = new ArrayList<>(List.of(String::toUpperCase,
				String::toLowerCase,
				s -> s += " " + getRandomChar('D', 'M') + ".",
				Challenge::reverse,
				s -> s += " " + reverse(s, 0, s.indexOf(" ")),
				String::new, 
				s -> new String("New " + s),
				String::valueOf,
				person::last

		));
		applyChanges(names, list);

	}

	private static void applyChanges(String[] names, List<UnaryOperator<String>> stringfunctions) {
		List<String> backedByArray = Arrays.asList(names);
		for (var function : stringfunctions) {
			backedByArray.replaceAll(s -> s.transform(function));
			System.out.println(Arrays.toString(names));
		}
	}

	private static char getRandomChar(char startChar, char endChar) {
		return (char) random.nextInt(startChar, endChar + 1);
	}

	private static String reverse(String s) {
		return reverse(s, 0, s.length());
	}

	private static String reverse(String s, int start, int end) {
		return new StringBuilder(s.substring(start, end)).reverse().toString();

	}
}
