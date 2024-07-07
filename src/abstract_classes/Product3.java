package abstract_classes;

public class Product3 extends ProductForSale {

	public Product3(String type, double price, String description) {
		super(type, price, description);
	}

	@Override
	public void showDetails() {
		System.out.println("This product is :" +type);
		System.out.println("Product price is: " +price);
		System.out.println("Product description is : " + description);
	}

}
