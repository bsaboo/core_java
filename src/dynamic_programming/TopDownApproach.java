package dynamic_programming;

public class TopDownApproach {

	public static int fib(int[] memo, int n) {
		if (memo[n] == 0) {
			if (n < 2) {
				memo[n] = n;
			} else {
				int left = fib(memo, n - 1);
				int right = fib(memo, n - 2);
				memo[n] = left + right;
			}

		}
		return memo[n];
	}

	public static void main(String[] args) {
		int n = 6;
		int[] memo = new int[n+1];
		System.out.println(fib(memo, n));

	}

}
