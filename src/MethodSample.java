
public class MethodSample {
	public static void main(String[] args) {
		int finalScore;

		finalScore = finalScore(true, 800, 5, 100);
		System.out.println("Your final score :" + finalScore);
		System.out.println("Your final score :" + finalScore(true, 10000, 8, 200));

	}

	public static int finalScore(boolean gameOver, int finalScore, int levelCompleted, int bonus) {

		if (gameOver) {
			finalScore += (levelCompleted * bonus);
			finalScore += 1000;
		}
		return finalScore;
	}
}
