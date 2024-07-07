package hashset;

import java.util.HashSet;

public class IntersectionOftwoArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 3, 4, 5, 6, 7, 7 };

		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			set1.add(arr1[i]);
		}

		for (int i = 0; i < arr2.length; i++) {
			if (set1.contains(arr2[i])) {
				set2.add(arr2[i]);
			}
		}
		System.out.println(set2);

	}

}
