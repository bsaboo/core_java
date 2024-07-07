package recursion;

public class PowerofN {

	public static void main(String[] args) {
		int x = 4;
		int n = 2;
		System.out.println(calcpower(x, n));
		System.out.println(calcpower1(x, n));

	}

	//Stack height = n
	private static int calcpower(int x, int n) {
		if (n == 0) {
			return 1;
		}
		if (x == 0) {
			return 0;
		}
		x = x * calcpower(x, n - 1);
		return x;
	}
	
	//Stack Height = log n
	private static int calcpower1(int x, int n) {
		if (n == 0) {
			return 1;
		}
		if (x == 0) {
			return 0;
		}
		if(n %2 == 0) {
			return calcpower1(x, n/2) * calcpower1(x, n/2);
		}else {
			return calcpower1(x, n/2) * calcpower1(x, n/2) * x;
		}
	}
	
}
