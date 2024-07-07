package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class UnionofTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 3, 4, 5, 6, 7, 7 };

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			set.add(arr2[i]);
		}
		Iterator it = set.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
