package dynamic_programming;

import java.util.HashMap;
import java.util.Map;

public class BottomUpApproach {

	public static int fib(int n) {

		int[] table = new int[n + 1];

		table[0] = 0;
		table[1] = 1;
		for (int i = 2; i <= n; i++) {
			table[i] = table[i - 1] + table[i - 2];
		}
		return table[n];

	}

	public static void main(String[] args) {

		System.out.println(fib(6));
		Map<Integer,Integer> map = new HashMap<>();
		
	}

}
