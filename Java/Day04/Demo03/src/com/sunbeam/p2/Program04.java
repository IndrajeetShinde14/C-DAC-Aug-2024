package com.sunbeam.p2;

class BankAccount {
	// final int accno = ++generate_accno; // OK
	final int accno;
	static int generate_accno = 1000;
	String name;
	double balance;

	{
		// accno = ++generate_accno; // OK
	}

	BankAccount() {
		accno = ++generate_accno;
	}

	public BankAccount(String name, double balance) {
		accno = ++generate_accno;
		this.name = name;
		this.balance = balance;
	}

	public void displayDetails() {
		System.out.println("Accno - " + accno);
		System.out.println("Name - " + name);
		System.out.println("Balance - " + balance);
	}

	public static void displayAllAccounts(BankAccount... accounts) {
		for (BankAccount bankAccount : accounts)
			bankAccount.displayDetails();

	}
}

public class Program04 {

	public static void main(String[] args) {
		BankAccount accounts[] = new BankAccount[100];
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount("Anil", 10000);
		BankAccount b3 = new BankAccount("Mukesh", 20000);

		BankAccount.displayAllAccounts(accounts);
		// BankAccount.displayAllAccounts(b1, b2, b3);

	}

}
