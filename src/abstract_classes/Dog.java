package abstract_classes;

public class Dog extends Animal {

	public Dog(String type, String size, double weight) {
		super(type, size, weight);
	}

	public void move(String speed) {
		System.out.println("Dog speed is : " + speed);
		System.out.println("Dog type: " + type);
		System.out.println("Main type: " + getType());

	}

	public void makeNoise() {

		System.out.println("Dog making noise...");

	}

}
