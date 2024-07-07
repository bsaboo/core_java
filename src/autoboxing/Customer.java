package autoboxing;

import java.util.ArrayList;

public class Customer {
	String name;
	ArrayList<Double> transactions;
	
	public Customer(String name) {
		this.name = name;
		this.transactions = new ArrayList<>();
	}


	public String getName() {
		return name;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}
	
	public void addTransaction(double amount) {
		transactions.add(amount);
	}
	

}
