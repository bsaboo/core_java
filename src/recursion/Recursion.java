package recursion;

public class Recursion {

	public static void main(String[] args) {

		int n = 5;
		System.out.println("Printing all numbers is descending order.");
		printNumbers(n);
		System.out.println("Printing all numbers is ascending order.");
		n = 1;
		printAscNumbers(n);
		n = 5;
		System.out.println("Factorial of " + n);
		System.out.println(factorial(n));

		System.out.println("Sum of " + n + " numbers");
		System.out.println(sum(1, 5, 0));
	}

	private static int sum(int i, int n, int sum) {
		if (n == i)
			return i + sum;
		sum = i + sum(i + 1, n, sum);
		return sum;
	}

	private static void printAscNumbers(int n) {
		if (n == 6) {
			System.out.println();
			return;
		}

		System.out.print(n + " ");
		printAscNumbers(n + 1);

	}

	private static int factorial(int n) {
		if (n == 1)
			return 1;
		int fact = n * factorial(n - 1);

		return fact;

	}

	private static void printNumbers(int n) {
		if (n == 0) {
			System.out.println();
			return;
		}

		System.out.print(n + " ");
		printNumbers(n - 1);

	}

}
