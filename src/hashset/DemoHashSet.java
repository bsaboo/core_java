package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class DemoHashSet {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(5);
		set.add(1);
		set.add(1);
		set.add(3);
		set.add(4);
		set.remove(4);
		System.out.println(set.contains(1));
		System.out.println(set);
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
