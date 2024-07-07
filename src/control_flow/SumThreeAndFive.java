package control_flow;

public class SumThreeAndFive {

	public static void main(String[] args) {

		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 1000; i++) {
			if (count == 5) {
				break;
			} else {
				if (i % 3 == 0 && i % 5 == 0) {

					System.out.println(i);
					sum = sum + i;
					count++;

				}
			}
		}
		System.out.println("Sum =" + sum);
	}

}
