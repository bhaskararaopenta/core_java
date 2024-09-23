package com.day5.Assignment3;

public class SavingsAccount extends BankAccount {

	int accountNumber;
	double balance;

	public SavingsAccount(int accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	@Override
	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

	@Override
	public double withdraw(double amount) {
		if (amount > balance) {
			System.out.println("InsufficientFunds");
		} else {
			balance = balance - amount;

		}
		return balance;

	}

}
