package basic_challenges;

public class SpeedConverter {

	public static void main(String[] args) {
		areEqualByThreeDecimalPlaces(-3.1756, -3.175);
		areEqualByThreeDecimalPlaces(3.175, 3.176);
		areEqualByThreeDecimalPlaces(3.0, 3.0);
		areEqualByThreeDecimalPlaces(-3.123, 3.123);
	}

	public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

		return ((long) (num1 * 1000) == (long) (num2 * 1000));

	}

}
