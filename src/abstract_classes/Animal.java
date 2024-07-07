package abstract_classes;

abstract class Mammal extends Animal {

	public Mammal(String type, String size, double weight) {
		super(type, size, weight);
	}

}

public abstract class Animal {
	protected String type;
	private String size;
	private double weight;

	public Animal(String type, String size, double weight) {
		super();
		this.type = type;
		this.size = size;
		this.weight = weight;
	}

	public abstract void move(String speed);

	public abstract void makeNoise();

	public final String getType() {
		return getClass().getSimpleName() + type;
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", size=" + size + ", weight=" + weight + "]";
	}

}
