package enum_project;

public enum Toppings {
	MUSTARD, PICKLES, CHEDDAR;

	public double getPrice() {
		return switch (this) {
		case MUSTARD -> 1.5;
		case PICKLES -> 1.0;
		default -> 0.0;
		};
	}
}
