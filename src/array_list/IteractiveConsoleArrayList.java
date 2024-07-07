package array_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class IteractiveConsoleArrayList {

	public static void main(String[] args) {
		availableactions();
	}

	private static void availableactions() {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;

		ArrayList<String> lists = new ArrayList<>();

		while (run) {
			System.out.println("Enter a number for which action you want to do:");
			int input = scanner.nextInt();
			switch (input) {
			case 0 -> run = false;
			case 1 -> addItem(lists);
			case 2 -> removeItem(lists);
			default -> System.out.println("Invalid input");
			}
			lists.sort(Comparator.naturalOrder());
			System.out.println(lists);
		}

	}

	private static void removeItem(ArrayList<String> lists) {
		System.out.println("Enter item to remove:");
		Scanner scanner = new Scanner(System.in);

		String remove = scanner.nextLine();
		if (lists.contains(remove.trim())) {
			lists.remove(remove);
		} else {
			System.out.println("Item does not exists");
		}
	}

	private static void addItem(ArrayList<String> lists) {
		System.out.println("Enter items to add comma seperated");
		Scanner scanner = new Scanner(System.in);
		String[] items = scanner.nextLine().split(",");
		for (String i : items) {
			String trimmed = i.trim();
			if (lists.indexOf(trimmed) < 0) {
				lists.add(trimmed);
			}
		}
	}
}
