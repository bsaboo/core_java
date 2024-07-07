package method_overloading;

public class CalculateScore {

	public static void main(String[] args) {
		int newScore = calculateScore("Bansi", 10);
		System.out.println("New Score = " + newScore);

		int unnamedScore = calculateScore(100);
		System.out.println("Unnamed score =" + unnamedScore);

	}

	public static int calculateScore(String playerName, int score) {
		System.out.println("Player" + playerName + "Score is : " + score);
		return score * 1000;
	}

	public static int calculateScore(int score) {
		return calculateScore("Unnamed", score);
		// System.out.println("Player Unnamed, Score is : "+score);

		// return score *50;
	}

}
