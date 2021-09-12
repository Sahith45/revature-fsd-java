package com.revature.bankapp.account;

public class Account {
	protected  String accountNumber;
	protected double balance;
	public Account(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public Account(String name) {
		super();
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	
	
	
	

}
