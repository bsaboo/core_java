package abstract_classes;

public class OrderItem {
	
	public int quantity;
	
	public ProductForSale productForSale;
	
	public OrderItem(int quantity, ProductForSale productForSale) {
		super();
		this.quantity = quantity;
		this.productForSale = productForSale;
	}
	public int getQuantity() {
		return quantity;
	}
	public ProductForSale getProductForSale() {
		return productForSale;
	}
	
}
