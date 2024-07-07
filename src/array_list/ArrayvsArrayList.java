package array_list;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayvsArrayList {

	public static void main(String[] args) {
		String[] originalArray = new String[] { "First", "Second", "Third" };
		var originalList = Arrays.asList(originalArray);

		originalList.set(0, "NewFirst");
		System.out.println(originalList);
		System.out.println(Arrays.toString(originalArray));

		originalList.sort(Comparator.naturalOrder());
		System.out.println(Arrays.toString(originalArray));

		// originalList.remove(0);
		// originalList.add("Fourth");

	}
}
