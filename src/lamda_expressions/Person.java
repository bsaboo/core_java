package lamda_expressions;

import java.util.ArrayList;
import java.util.List;

public class Person {
	public enum Sex {
		MALE, FEMALE
	}

	private String name;
	private int age;
	Sex gender;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public Person(String name, int age, Sex gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void printPerson() {
		System.out.println(this.toString());
	}

	public static List<Person> setDefaultList() {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Anil", 15, Sex.MALE));
		persons.add(new Person("Anee", 20, Sex.FEMALE));
		persons.add(new Person("Zeta", 21, Sex.MALE));
		return persons;

	}

}
