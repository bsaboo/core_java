package datastructures;

import java.util.LinkedList;
import java.util.Scanner;

public record Places(String name, int distance) {

	public static void main(String[] args) {
		LinkedList<Places> lists = new LinkedList<>();
		Places adelaide = new Places("Adelaide", 1374);
		addPlaces(lists, adelaide);
		addPlaces(lists, new Places("Brisbane", 917));
		addPlaces(lists, new Places("Perth", 3923));
		addPlaces(lists, new Places("Alice Spring", 2771));
		addPlaces(lists, new Places("Darwin", 3972));

		System.out.println(lists);
		menuOptions(lists);
	}

	@Override
	public String toString() {
		return String.format("%s (%d)", name, distance);
	}

	private static void addPlaces(LinkedList<Places> lists, Places place) {

		if (lists.contains(place)) {
			System.out.println("Duplicate");
			return;
		}
		for (Places p : lists) {
			if (p.name().equalsIgnoreCase(place.name())) {
				System.out.println("Found Duplicate" + place);
				return;
			}
		}
		int matchedIndex = 0;
		for (var listPlace : lists) {
			if (place.distance() < listPlace.distance()) {
				lists.add(matchedIndex, place);
				return;
			}
			matchedIndex++;

		}

		lists.add(place);
	}

	private static void menuOptions(LinkedList<Places> lists) {
		Scanner scanner = new Scanner(System.in);
		var iterator = lists.listIterator();
		boolean flag = true;
		boolean forward = true;

		System.out.println("Select word: F(oward), (B)ackward, (L)ist Places, (M)enu, Quit");

		while (flag) {
			if (!iterator.hasPrevious()) {
				System.out.println("Orgin: " + iterator.next());
				forward = true;
			}
			if (!iterator.hasNext()) {
				System.out.println("Final: " + iterator.previous());
				forward = false;
			}

			System.out.println("Enter value:");

			String input = scanner.nextLine().toUpperCase().substring(0, 1);
			System.out.println(input);

			switch (input) {
			case "F":
				System.out.println("Going forward");
				if (!forward) {
					forward = true;
					if (iterator.hasNext()) {
						System.out.println(iterator.next());
					}
				}
				break;

			case "B":
				System.out.println("Going backward");
				if (forward) {
					forward = false;
					if (iterator.hasPrevious()) {
						System.out.println(iterator.previous());
					}
				}
				break;
			case "L":
				listPlaces(lists);
				break;
			case "M":
				menuOptions(lists);
				break;
			default:
				flag = false;
				break;
			}
		}

	}

	private static void listPlaces(LinkedList<Places> lists) {
		// TODO Auto-generated method stub

	}

}
