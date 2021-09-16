package Encapsulation;

public class BankAccount {

	private String username = "explorist";
	private int balance = 10000;

	public int getBalance(String username) {
		if (this.username.equals(username)) {
			return this.balance;
		}
		System.out.println("Galat username hai!");
		return -1;
	}

	public void setBalance(int balance) {
		if (this.username.endsWith(username)) {
			this.balance = balance;
		}
		System.out.println("Access denied!");
	}
}
