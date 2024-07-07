package recursion;

public class TowerofHanoi {

	public static void main(String[] args) {
		int n = 3;
		String src = "S";
		String help = "H";
		String dest = "D";

		towerofHanoi(n, src, help, dest);

	}

	private static void towerofHanoi(int n, String src, String help, String dest) {
		if (n == 1) {
			System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
			return;
		
		}

		towerofHanoi(n - 1, src, dest, help);
		System.out.println("Transfer disk " + n + " from " + src + " to " + dest);

		towerofHanoi(n - 1, help, src, dest);

	}

}
