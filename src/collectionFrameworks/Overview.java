package collectionFrameworks;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Overview {

	public static void main(String[] args) {
		String[] names = { "Bansi", "Prince", "Ishita" };
		Collection<String> list = new HashSet<>();

		list.addAll(Arrays.asList(names));
		System.out.println(list);

		list.add("Rohe");
		System.out.println(list);

		list.removeIf(s -> s.charAt(0) == 'R');
		System.out.println(list);

		System.out.println("Rohe exists?" + list.contains("Rohe"));

	}

}
