package datastructures;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		var places = new LinkedList<String>();
		places.add("Delhi");
		places.add(0, "Ahmedabad");
		places.add("Mumbai");

		System.out.println(places);

		addMorePlaces(places);
		System.out.println(places);

		removePlaces(places);
		System.out.println(places);

		retrieveElements(places);
		
		printItinerary(places);
		
		testIterator(places);

	}

	private static void testIterator(LinkedList<String> places) {
		ListIterator<String> iterator = places.listIterator();
		
		while(iterator.hasNext()) {
			if(iterator.next().equals("Mumbai")) {
				iterator.remove();
				iterator.add("Mumbai");
			}
		}
		System.out.println(places);
		
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		System.out.println(places);
	}

	private static void printItinerary(LinkedList<String> places) {
		System.out.println("Trip starts: " +places.getFirst());
		
		for(int i = 1; i< places.size();i++) {
			System.out.println("   --From : " +places.get(i-1) + " to " +places.get(i));
		}
		System.out.println("Trip ends: " +places.getLast());
		
		String previousCity = places.getFirst();
		for(String city: places) {
			System.out.println("   --From : " +previousCity + " to " +city);
			previousCity = city;
		}
		System.out.println("Trip starts: " +places.getFirst());

		String previousCity1 = places.getFirst();
		ListIterator<String> iterator = places.listIterator(1);
		while(iterator.hasNext()){
			var town = iterator.next();
			System.out.println("   --From : " +previousCity1 + " to " +town);
			previousCity1 = town;
		}
		System.out.println("Trip ends: " +places.getLast());

		
		
	}

	private static void retrieveElements(LinkedList<String> places) {
		System.out.println(places.get(0));

		System.out.println(places.getFirst());
		System.out.println(places.getLast());
		System.out.println(places.indexOf("Mumbai"));
		System.out.println(places.lastIndexOf("Mumbai"));

		System.out.println(places.peek());
		System.out.println(places.peekFirst());
		System.out.println(places.peekLast());

	}

	private static void removePlaces(LinkedList<String> places) {
		places.remove(0);
		// places.removeAll(places);

	}

	private static void addMorePlaces(LinkedList<String> places) {
		places.addFirst("Goa");
		places.addLast("Kolkata");

		// Queue Methods
		places.offer("Punjab");
		places.offerFirst("Pune");
		places.offerLast("Bangalore");

	}

}
