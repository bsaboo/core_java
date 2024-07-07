package enum_project;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		DayOfTheWeek weekDay = DayOfTheWeek.TUES;
		System.out.println(weekDay);
		System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal());

		for (int i = 0; i < 10; i++) {
			weekDay = getRandomDay();
			/*
			 * System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(),
			 * weekDay.ordinal());
			 * 
			 * if (weekDay == DayOfTheWeek.FRI) { System.out.println("Found Friday"); }
			 */

			swtichDayofWeek(weekDay);
		}
	}

	public static DayOfTheWeek getRandomDay() {
		int randomInteger = new Random().nextInt(7);
		var allDays = DayOfTheWeek.values();
		return allDays[randomInteger];
	}

	public static void swtichDayofWeek(DayOfTheWeek weekDay) {
		int weekInteger = weekDay.ordinal() + 1;
		switch (weekDay) {
		case WED -> System.out.println("Wednesday is day" + weekInteger);
		case SAT -> System.out.println("Saturday is day" + weekInteger);
		default -> System.out.println(
				weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() + "day is Day" + weekInteger);
		}

	}

}
