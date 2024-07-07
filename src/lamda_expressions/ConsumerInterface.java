package lamda_expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class ConsumerInterface {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(List.of("Alpha", "Bravo", "Charlie"));

		for (String s : list) {
			System.out.println(s);
		}

		System.out.println("-------------------");
		
		// Using Lamda
		list.forEach((var myString) -> System.out.println(myString));

		System.out.println("--------------------");
		list.forEach((var myString) -> {
			char first = myString.charAt(0);
			System.out.println(myString + " means " + first);
		});

		System.out.println("-------------------");

		list.removeIf(s -> s.equalsIgnoreCase("bravo"));
		list.forEach(s -> System.out.println(s));

		list.replaceAll(s -> s.charAt(0) + "-" + s.toUpperCase());
		list.forEach(s -> System.out.println(s));

		System.out.println("-------------------");

		String[] emptyString = new String[10];
		System.out.println(Arrays.toString(emptyString));
		
		Arrays.setAll(emptyString, (i) -> ""+(i+1)+". ");
		System.out.println(Arrays.toString(emptyString));

		Arrays.setAll(emptyString, (i) -> ""+(i+1)+". "
				+switch(i) {
				case 0 -> "one";
				default -> "";
				}
		
				);
		System.out.println(Arrays.toString(emptyString));
		
		String[] names = {"Bansi","Prince","Ishita"};
		String[] randomList = randomlySelectedValues(10,names,
				() -> new Random().nextInt(0,names.length));
		System.out.println(Arrays.toString(randomList));
		
		System.out.println("-------------------");

		calculator((a, b) -> a + b, 2, 3);
		calculator((a, b) -> a / b, 10.0, 2.5);
		calculator((a, b) -> a.toUpperCase() + b.toUpperCase(), "Bansi ", "Saboo");

		System.out.println("-------------------");

		var coords = Arrays.asList(new Double[] { 47.2, -98.0 }, new Double[] { 89.4, -94.0 });

		coords.forEach(s -> System.out.println(Arrays.toString(s)));

		BiConsumer<Double, Double> p1 = (lat, lang) -> System.out.printf("[lat:%.3f lang:%.3f]%n", lat, lang);
		proccessPoint(coords.get(0)[0], coords.get(0)[1], p1);

		coords.forEach(s -> proccessPoint(s[0], s[1], p1));
		// (lat, lang) -> System.out.printf("[lat:%.3f lang:%.3f]%n", lat, lang)));

		
	}

	public static <T> T calculator(BinaryOperator<T> function, T value1, T value2) {
		T result = function.apply(value1, value2);
		System.out.println("Result: " + result);
		return result;
	}

	public static <T> void proccessPoint(T t1, T t2, BiConsumer<T, T> consumer) {
		consumer.accept(t1, t2);
	}

	public static String[] randomlySelectedValues(int count, String[] values, Supplier<Integer> s) {
		String[] selectedValues = new String[count];
		for (int i = 0; i < count; i++) {
			selectedValues[i] = values[s.get()];
		}
		return selectedValues;
	}
}
