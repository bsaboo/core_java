package hashmap;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {

		HashMap<String, Integer> countryMap = new HashMap<>();
		countryMap.put("India", 12000);
		countryMap.put("China", 1000);
		countryMap.put("US", 100);
		countryMap.put("US", 10000);

		System.out.println(countryMap);

		System.out.println(countryMap.containsKey("India"));
		System.out.println(countryMap.get("India"));

		for (Map.Entry<String, Integer> e : countryMap.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());

		}

	}

}
