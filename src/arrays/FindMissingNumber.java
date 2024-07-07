package arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6, 7 };
		int num = findMissingNumber(arr);
		System.out.println(num);

	}

	private static int findMissingNumber(int[] arr) {
		int range = arr.length + 1;
		int sum = (range * (range + 1)) / 2;
		for (int num : arr) {
			sum -= num;
		}

		return sum;
	}

}
