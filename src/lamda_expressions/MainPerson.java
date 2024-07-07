package lamda_expressions;

import java.util.List;
import java.util.function.Predicate;

public class MainPerson {

	@FunctionalInterface
	interface CheckPerson {
		boolean test(Person p);
	}

	static class CheckPersonEligibleForSelectiveSearch implements CheckPerson {

		@Override
		public boolean test(Person p) {

			return p.gender == Person.Sex.MALE && p.getAge() > 18 && p.getAge() <= 25;

		}

	}

	// How the methods were defined before lamda
	public static void printPersonOlderThan(List<Person> people, int age) {
		for (Person p : people) {
			if (p.getAge() > age) {
				System.out.println(p);
			}
		}
	}

	public static void printPersonWithinRange(List<Person> people, int age1, int age2) {
		for (Person p : people) {
			if (p.getAge() > age1 && p.getAge() < age2) {
				p.printPerson();
			}
		}
	}

	public static void printPeople(List<Person> people, CheckPerson tester) {
		for (Person p : people) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}
	}

	public static void main(String[] args) {
		// \u000d System.out.println("Hello, World!");

		/*
											 * List<Person> people = Person.setDefaultList(); //
											 * printPersonOlderThan(people, 30); // printPersonWithinRange(people, 31,
											 * 50); printPeople(people, new CheckPersonEligibleForSelectiveSearch());
											 * 
											 * // without declaring the implemenetation printPeople(people, new
											 * CheckPerson() {
											 * 
											 * @Override public boolean test(Person p) { return p.gender ==
											 * Person.Sex.MALE && p.getAge() > 18 && p.getAge() <= 25;
											 * 
											 * } });
											 * 
											 * // without lamda printPeople(people, (p) -> p.gender == Person.Sex.MALE
											 * && p.getAge() > 18 && p.getAge() <= 25);
											 * 
											 * // without lamda printPeoplewithPredicate(people, (p) -> p.gender ==
											 * Person.Sex.MALE && p.getAge() > 18 && p.getAge() <= 25);
											 */
	}

	private static void printPeoplewithPredicate(List<Person> people, Predicate<Person> tester) {
		for (Person p : people) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}

	}

	
}
