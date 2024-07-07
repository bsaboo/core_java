package autoboxing;

import java.util.ArrayList;

public class Bank {
	String bankName;
	ArrayList<Customer> customers;

	public Bank(String bankName) {
		this.bankName = bankName;
		this.customers = new ArrayList<>();
	}

	public String getBankName() {
		return bankName;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void addTransaction(String customerName, Double amount) {
		if (customerExists(customerName)) {
			Customer customer = getCustomer(customerName);
			customer.addTransaction(amount);
			System.out.println("Transaction added for customer" + customerName + "for amount: " + amount);
		} else {
			System.out.println("Customer: " + customerName + " not found");
		}
	}

	private boolean customerExists(String customerName) {
		for (Customer customer : customers) {
			if (customer.getName().equals(customerName)) {
				return true;
			}
		}
		return false;
	}

	private Customer getCustomer(String customerName) {
		for (Customer customer : customers) {
			if (customer.getName().equals(customerName)) {
				return customer;
			}
		}
		return null;
	}

	public void addCustomer(String customerName) {
		if (!customerExists(customerName)) {
			customers.add(new Customer(customerName));
			System.out.println("Customer added: " + customerName);
		} else {
			System.out.println("Customer already exists");
		}
	}

	public void printStatement(String customerName) {
		if (customerExists(customerName)) {
			Customer customer = getCustomer(customerName);
			System.out.println("Statement for " + customerName + " : ");

			for (Double transaction : customer.getTransactions()) {
				System.out.println("Transaction : " + transaction);
			}

		} else {
			System.out.println("Customer " + customerName + " not found");
		}

	}
}
