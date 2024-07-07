package abstract_classes;

public class Product2 extends ProductForSale{

	public Product2(String type, double price, String description) {
		super(type, price, description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showDetails() {
		System.out.println("This product is :" +type);
		System.out.println("Product price is: " +price);
		System.out.println("Product description is : " + description);
	}

}
