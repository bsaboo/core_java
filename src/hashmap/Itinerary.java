package hashmap;

import java.util.HashMap;

public class Itinerary {

	public static void main(String[] args) {
		String entrypoint = "";
		HashMap<String, String> tickets = new HashMap<>();
		tickets.put("Chennai", "Bangalore");
		tickets.put("Mumbai", "Delhi");
		tickets.put("Goa", "Chennai");
		tickets.put("Delhi", "Goa");

		// selecting the starting point

		for (String key : tickets.keySet()) {
			if (!tickets.containsValue(key)) {
				entrypoint = key;
			}
		}

		// print the itinerary
		while (tickets.containsKey(entrypoint)) {
			System.out.print(entrypoint + "->>");
			entrypoint = tickets.get(entrypoint);
		}
		System.out.println(entrypoint);

	}

}
