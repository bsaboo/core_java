package method_references;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

class PlainOld {
	private static int last_id = 1;
	private int id;

	public PlainOld() {
		id = PlainOld.last_id++;
		System.out.println("Creating plainOld object" + id);
	}

}

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(List.of("Bansi", "Ishita", "Vinita"));

		list.forEach(System.out::println);

		/*
		 * Method references for static methods
		 */
		// calculator((a, b) -> a + b, 1, 2);
		calculator(Integer::sum, 1, 2);
		calculator(Double::sum, 1.0, 2.2);

		/*
		 * Method References for constructor
		 */

		// Supplier<PlainOld> supplier = () -> new PlainOld();
		Supplier<PlainOld> supplier = PlainOld::new;
		PlainOld newPojo = supplier.get();

		/*
		 * Method References for instance methods
		 */

		PlainOld[] pojo1 = seedArray(supplier, 5);
		PlainOld[] pojo2 = seedArray(PlainOld::new, 5);

		calculator((s1, s2) -> s1 + s2, "Hello", " World");
		calculator((s1, s2) -> s1.concat(s2), "Hello", " World");
		calculator(String::concat, "Hello", " World");

		BinaryOperator<String> b1 = (s1, s2) -> s1.concat(s2);
		BiFunction<String, String, String> b2 = String::concat;
		UnaryOperator<String> u1 = String::toUpperCase;

		System.out.println(b1.apply("Hello", "World"));
		System.out.println(b2.apply("Hello", "World"));
		System.out.println(u1.apply("Bansi"));

		// UnaryOperator<String> u1 = String::concat;

		String result = "Hello".transform(u1);
		System.out.println("Result=" + result);

		result = result.transform(String::toLowerCase);
		System.out.println(result);

		Function<String, Boolean> f0 = String::isEmpty;
		boolean resultBoolean = result.transform(f0);
		System.out.println("Result: " + resultBoolean);

	}

	private static <T> void calculator(BinaryOperator<T> function, T a, T b) {
		T result = function.apply(a, b);
		System.out.println(result);
	}

	private static PlainOld[] seedArray(Supplier<PlainOld> supplier, int count) {
		PlainOld[] array = new PlainOld[count];
		Arrays.setAll(array, i -> supplier.get());
		return array;
	}

}
