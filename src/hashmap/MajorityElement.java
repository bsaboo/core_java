package hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 2,2,2,2, 3, 3 };
		System.out.println(Arrays.toString(nums));
		System.out.println("Array length :" +nums.length);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int num : nums) {
			if (map.containsKey(num)) {
				map.put(num,map.get(num)+1);
			}else {
				map.put(num, 1);
			}
		}
		
		System.out.println(map);
		
		for(int key : map.keySet()) {
			if(map.get(key) > nums.length/2) {
				System.out.println("Element " +key +"occurs more than ");
			}
		}

	}

}
