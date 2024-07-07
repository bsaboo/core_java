package recursion;

public class TilePlacementRecursive {
	public static void main(String[] args) {
		int m = 2; // Width of the tile
		int n = 4; // Size of the floor (rows)

		int ways = countWaysToPlaceTiles(m, n);

		System.out.println("Number of ways to place tiles: " + ways);
	}

	// Function to count the number of ways to place tiles on a floor
	private static int countWaysToPlaceTiles(int m, int n) {
		// Create an array to store the number of ways for each cell in the floor
		int[] dp = new int[n + 1];

		// There is one way to place tiles in the first cell (dp[0])
		dp[0] = 1;

		// Calculate the number of ways for each cell in the floor
		for (int i = 1; i <= n; i++) {
			if (i < m) {
				// If the floor is less than the width of the tile, there is only one way
				dp[i] = 1;
			} else {
				// Calculate the number of ways based on the previous cells
				dp[i] = dp[i - 1] + dp[i - m];
			}
		}

		// The result is stored in the last cell of the array
		return dp[n];
	}
}
