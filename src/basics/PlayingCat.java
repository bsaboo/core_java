/*The cats spend most of the day playing. 
 * In particular, they play if the temperature is between 25 and 35 (inclusive). 
 * Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.
*/
package basics;

public class PlayingCat {

	public static void main(String[] args) {
		System.out.println(isCatPlaying(true, 10));
		System.out.println(isCatPlaying(false, 36));
		System.out.println(isCatPlaying(false, 35));
	}

	public static boolean isCatPlaying(boolean summer, int temperature) {
		int max = summer ? 45 : 35;
		return temperature >= 25 && temperature <= max;

	}

}
