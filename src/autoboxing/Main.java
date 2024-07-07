package autoboxing;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank("ICICI");

		bank.addCustomer("Bansi");
		bank.addCustomer("Prince");

		bank.addTransaction("Bansi", 50000.00);
		bank.addTransaction("Prince", 100000.00);
		bank.addTransaction("Prince", -1000.00);

		bank.printStatement("Bansi");
		bank.printStatement("Prince");

	}

}
