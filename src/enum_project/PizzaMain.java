package enum_project;

public class PizzaMain {

	public static void main(String[] args) {
		var toppings = Toppings.values();
		System.out.println(toppings);

		for (Toppings topping : toppings) {
			System.out.println(topping.name() + " Price: " + topping.getPrice());
		}
		for (int i = 0; i < toppings.length; i++) {
			System.out.println(toppings[i].name() + " PRice: " + toppings[i].getPrice());

		}

	}

}
