package constructor;

public class CustomerMain {

	public static void main(String[] args) {
		Customer customer = new Customer();
		System.out.println(customer.getName() + customer.getCreditLimit() + customer.getEmail());

		Customer customer2 = new Customer("John", 100.00, "john@gmail.com");
		System.out.println(customer2.getName() + customer2.getCreditLimit() + customer2.getEmail());

		Customer customer3 = new Customer("Ishita", "ishita@gmail.com");
		System.out.println(customer3.getName() + customer3.getCreditLimit() + customer3.getEmail());

	}

}
