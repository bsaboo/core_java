package OOPS;

public class Bank {
	private int accountNumber = 1;
	private double accountBalance = 1000;
	private String custName = "Bansi";
	private String email = "bansisaboo@gmail.com";
	private String phoneNumber = "4374294240";

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static double deposit(double accountBalance, double depositAmount) {
		try {
			accountBalance += depositAmount;
		} catch (Exception e) {
			System.out.println("Deposit Amount should be positive");
		}
		return accountBalance;
	}

	public static double withdraw(double accountBalance, double withdrawalAmount) {
		try {
			if (accountBalance > withdrawalAmount)
				accountBalance -= withdrawalAmount;
			else
				System.out.println("Cannot be withdrwal");
		} catch (Exception e) {
			System.out.println("Deposit Amount should be positive");
		}
		return accountBalance;
	}
}
