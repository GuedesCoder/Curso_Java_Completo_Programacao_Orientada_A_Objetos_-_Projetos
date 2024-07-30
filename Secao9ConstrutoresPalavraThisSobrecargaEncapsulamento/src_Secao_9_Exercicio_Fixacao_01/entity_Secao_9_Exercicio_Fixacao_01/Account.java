package entity_Secao_9_Exercicio_Fixacao_01;

public class Account {
	private int accountNumber;
	private String accountHolder;
	private double balance;

	public Account() {
	}

	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}

	public Account(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= (amount + 5.00);
	}

	public String toString() {
		return "\n	Account: " + getAccountNumber() 
				+ "\n	Holder: " + getAccountHolder() 
				+ "\n	Balance: $ " + String.format("%.2f", getBalance()); 
	}
}
