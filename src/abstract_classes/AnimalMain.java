package abstract_classes;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {
		Dog dog = new Dog("Lab", "big", 25);
		dog.makeNoise();
		dog.move("fast");
		doAnimalStuff(dog);

		ArrayList<Animal> animal = new ArrayList<>();
		animal.add(dog);
		animal.add(new Dog("Lab", "samll", 30.00));
		System.out.println(animal.toString());
		
	}

	private static void doAnimalStuff(Animal animal) {
		animal.makeNoise();
		animal.move("slow");
	}

}
