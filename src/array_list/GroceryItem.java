package array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public record GroceryItem(String name, String type, int count) {

	public GroceryItem(String name) {
		this(name, "Diary", 1);
	}

	@Override
	public String toString() {
		return String.format("%d %s in %s", count, name.toUpperCase(), type);
	}

	public static void main(String[] args) {
		
		ArrayList<GroceryItem> list = new ArrayList<>();
		list.add(new GroceryItem("Milk"));
		list.add(new GroceryItem("Butter"));
		list.add(new GroceryItem("Apples"));

		list.set(0, new GroceryItem("Oranges", "Produce", 6));
		System.out.println(list);

		list.remove(1);
		System.out.println(list);

		System.out.println(list.getClass().getName());

		String[] items = { "A", "B", "C" };
		List<String> lists = List.of(items);
		System.out.println(lists);

		ArrayList<String> groc = new ArrayList<>(lists);
		groc.add("new");
		System.out.println(groc);
		System.out.println(lists.getClass().getName());
		// lists.add("new");

		ArrayList<String> nextList = new ArrayList<>(List.of("X", "Y", "Z"));
		groc.addAll(nextList);
		System.out.println((groc));

		System.out.println("Third Item: " +groc.get(2));
		
		if(groc.contains("X")) {
			System.out.println("Contains X");
		}
		
		System.out.println("First index of X:" +groc.indexOf("X"));
		System.out.println("Last index of X:" +groc.lastIndexOf("X"));
		groc.remove(1);
		System.out.println(groc);
		groc.removeAll(List.of("A","Z"));
		System.out.println(groc);
		groc.retainAll(List.of("new"));
		System.out.println(groc);
		
		groc.clear();
		System.out.println(groc.isEmpty());
		
		groc.addAll(Arrays.asList("NEw2","NEw1"));
		
		System.out.println(groc);
		
		groc.sort(Comparator.naturalOrder());
		System.out.println(groc);
		
		groc.sort(Comparator.reverseOrder());
		System.out.println(groc);

	}

}
