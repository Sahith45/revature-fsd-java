package com.revature.bankapp.account;

public class Account {
	
	protected static  String accountNumber;
	protected double balance;
	public Account(String accountNumber, double balance) {
		super();
		
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public Account(String name) {
		super();
	}
	public static String getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	
	
	
	

}
