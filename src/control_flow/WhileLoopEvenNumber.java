package control_flow;

public class WhileLoopEvenNumber {

	public static void main(String[] args) {
		int number = 5;
		int finishNumber = 20;
		int count = 0;
		while (number < finishNumber) {
			number++;
			if (!isEvenNumber(number)) {
				continue;
			}
			count++;
			System.out.println(number + " is Even");
			if (count == 5)
				break;
		}

		System.out.println("Count" + count);
	}

	public static boolean isEvenNumber(int number) {
		return number % 2 == 0;
	}
}
