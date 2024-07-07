package control_flow;

public class PrimeNumbers {

	public static void main(String[] args) {
		int countPrimeNumbers = 0;
		for (int i = 10; i <= 50; i++) {
			System.out.println(i + " is " + (isPrime(i) ? "" : " NOT ") + " prime number");

			if (isPrime(i))
				countPrimeNumbers++;
		}
		System.out.println(countPrimeNumbers);

	}

	public static boolean isPrime(int wholeNumber) {
		if (wholeNumber <= 2) {
			return (wholeNumber == 2);
		}
		for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
			if (wholeNumber % divisor == 0) {
				return false;
			}
		}
		return true;
	}

}
