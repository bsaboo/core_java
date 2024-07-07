package abstract_classes;

import java.util.ArrayList;

public class Store {
	private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
	private static ArrayList<OrderItem> orders = new ArrayList<>();
	public static void main(String[] args) {
		
		storeProducts.add(new Product1("Furniture", 100, "Furniture desc"));
		storeProducts.add(new Product2("Wall painting", 200, "WP desc"));
		storeProducts.add(new Product3("Art work", 300, "Art desc"));

		listProducts();
		addItemOrder(orders,1,3);

		addItemOrder(orders,0,5);
		printOrder(orders);

	}

	public static void addItemOrder(ArrayList<OrderItem> order, int orderIndex, int quantity) {
		order.add(new OrderItem(quantity, storeProducts.get(orderIndex)));
	}

	public static void listProducts() {
		for (ProductForSale product : storeProducts) {
			product.showDetails();
		}
	}
	
	public static void printOrder(ArrayList<OrderItem> order) {
		double salesTotal=0;
		for(var item: order) {
			item.getProductForSale().printPricedLineItem(item.getQuantity());
			salesTotal+= item.getProductForSale().salesPrice(item.getQuantity());
		}
		
		System.out.println("Sales Total:" +salesTotal);
	}

}
