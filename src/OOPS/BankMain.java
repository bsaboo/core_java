package OOPS;

public class BankMain {

	public static void main(String[] args) {
		double depositAmount = 100;
		Bank bank = new Bank();
		double balance = bank.getAccountBalance();
		double remainingBalance = bank.deposit(balance, depositAmount);
		System.out.println("Deposited " + depositAmount + "Remianing Balalnce " + remainingBalance);

	}

}
