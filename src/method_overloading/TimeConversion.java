package method_overloading;

public class TimeConversion {
	public static void main(String[] args) {
		System.out.println(getDurationString(3945));
		System.out.println(getDurationString(65, 45));

	}

	public static String getDurationString(int seconds) {

		if (seconds < 0) {
			return "Seconds should be greater than zero.";
		} else {
			return getDurationString(seconds / 60, seconds % 60);
		}
	}

	public static String getDurationString(int minutes, int seconds) {

		if (minutes < 0) {
			return "Minutes should be greater than zero.";
		} else if (seconds <= 0 || seconds >= 59) {
			return "Seconds should be between 0 to 59 ";
		} else {
			int hour = minutes / 60;
			int remainingMinutes = minutes % 60;
			return (hour + "hr" + remainingMinutes + "min " + seconds + "sec");

		}
	}

}
