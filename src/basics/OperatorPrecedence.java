package basics;

public class OperatorPrecedence {

	public static void main(String[] args) {
		double num1 = 20.00d;
		double num2 = 80.00d;
		double result;
		double remainder;
		boolean isZero;

		result = (num1 + num2) * 100.00d;

		remainder = result % 40.00d;

		isZero = (remainder == 0) ? true : false;

		System.out.println(isZero);

		if (isZero) {
			System.out.println("Remainder is zero");
		} else {
			System.out.println("Remainder is not zero");
		}

	}

}
