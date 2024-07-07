package datastructures;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class DecimaltoBinary {

	private static String[] generateBinary(int n) {
		String[] result = new String[n];
		Queue<String> queue = new LinkedList<>();
		queue.offer("1");
		for(int i =0; i < n ;i++) {
			result[i] = queue.poll();
			queue.offer(result[i] + "0");
			queue.offer(result[i] + "1");
		}
		
		return result;
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println("Converted 1 to " + n + " numbers to binary");
		
		String[] values = generateBinary(3);
		Arrays.asList(values).forEach(value -> System.out.println(value));
	}

}
