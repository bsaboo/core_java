package inheritance;

public class Animal {

	private String type;
	private String size;
	private double weight;

	public Animal(String type, String size, double weight) {
		this.type = type;
		this.size = size;
		this.weight = weight;
	}

	private void move(String speed) {

	}

	private static void makeNoise() {

	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", size=" + size + ", weight=" + weight + "]";
	}

}
