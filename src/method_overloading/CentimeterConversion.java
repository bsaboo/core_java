package method_overloading;

public class CentimeterConversion {

	public static void main(String[] args) {
		System.out.println("10 inches is equal to " + convertToCentimeters(10) + "cms");
		System.out.println("5 foot 8 inches is equal to " + convertToCentimeters(5, 8) + "cm");

	}

	private static double convertToCentimeters(int heightinInches) {
		return (double) heightinInches * 2.54;
	}

	private static double convertToCentimeters(int heightinFeet, int heightinInches) {
		double totalHeightinInches = (heightinFeet * 12) + heightinInches;
		double totalHeightinCm = convertToCentimeters((int) totalHeightinInches);
		return totalHeightinCm;
	}

}
