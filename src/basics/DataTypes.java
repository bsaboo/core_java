package basics;

public class DataTypes {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		int num3 = (10 + 5) + (2 * 10);
		int num4 = 0;
		int num5 = 10_5_2;
		float num6 = 10f;
		double num7 = 10d;
		char char1 = 'a';
		char char2 = 'b';
		boolean isTrue = true;
		

		System.out.println("Number1 =" + num1 + " Number2=" + num2 + "Number3 =" + num3 + "Number4=" + num4
				+ "Number5 =" + num5 + "Number6 =" + num6 +"Number7=" +num7);
		
		System.out.println("Adding two char: " +(char1+char2));
		num1 = 5;
		num2 = 10;
		System.out.println("Number1 =" + num1 + " Number2=" + num2);

		num4 = 1000 - (num1 + num2) / num3;
		System.out.println("Number4 =" + num4);
		
		

		System.out.println("Max value to be store in byte: " + Byte.MAX_VALUE);
		System.out.println("Min value to be store in byte: " + Byte.MIN_VALUE);

		System.out.println("Size in byte: " + Byte.SIZE);

		System.out.println("Max value to be store in short: " + Short.MAX_VALUE);
		System.out.println("Min value to be store in short: " + Short.MIN_VALUE);

		System.out.println("Size in short: " + Short.SIZE);

		System.out.println("Max value to be store in int: " + Integer.MAX_VALUE);
		System.out.println("Min value to be store in int: " + Integer.MIN_VALUE);

		System.out.println("Max value to be store in float: " + Float.MAX_VALUE);
		System.out.println("Min value to be store in float: " + Float.MIN_VALUE);

		System.out.println("Max value to be store in long: " + Integer.MAX_VALUE);
		System.out.println("Min value to be store in long: " + Integer.MIN_VALUE);

		System.out.println("Overflow: " + (Integer.MAX_VALUE + 1));
		System.out.println("Underflow: " + (Integer.MIN_VALUE - 1));

	}

}
