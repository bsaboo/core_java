package basics;

public class MethodChallenge {

	public static void main(String[] args) {

		displayHighScorePosition("Bansi", 1);
		System.out.println(calculateHighScorePosition(1000));
	}

	private static int calculateHighScorePosition(int score) {
		int result;
		if (score >= 1000) {
			result = 1;
		} else if (score >= 500 && score < 1000) {
			result = 2;
		} else if (score >= 100 && score < 500) {
			result = 3;

		} else {
			result = 4;
		}
		return result;
	}

	private static void displayHighScorePosition(String playerName, int position) {
		System.out.println(playerName + " is on: " + position + " position");

	}

}
