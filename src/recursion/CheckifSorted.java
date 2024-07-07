package recursion;

public class CheckifSorted {

	public static void main(String[] args) {
		int[] arr = { 4, 5 };
		System.out.println(checkSorted(arr, 0));

	}

	private static boolean checkSorted(int[] arr, int i) {
		if (i == arr.length - 1) {
			return true;
		}
		if (arr[i] < arr[i + 1]) {
			return checkSorted(arr, i + 1);
		} else {
			return false;
		}
	}
}
