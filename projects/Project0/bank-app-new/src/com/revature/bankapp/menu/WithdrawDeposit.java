package com.revature.bankapp.menu;

import java.util.Scanner;

public class WithdrawDeposit extends Menu {

	public static String accNumber;
	public static String transferAccNum;
	Scanner sc = new Scanner(System.in);
	// CustomerMainMenu cm = new CustomerMainMenu("Customer Menu");

	public WithdrawDeposit(String name) {
		super(name);
		addMenuItem("Withdraw");
		addMenuItem("Deposit");
		addMenuItem("View Transactions");
		addMenuItem("View Balance");
		addMenuItem("Transfer to account");
		addMenuItem("Return to Customer Menu");
		addMenuItem("LogOut");
	}

	public String getAccount() {
		System.out.println("Enter Account number to make transaction: ");
		accNumber = sc.nextLine();
		System.out.println("Account Number: " + accNumber);
		return accNumber;
	}

	@Override
	void handleAction() {
		switch (selection) {

		case 1:

			System.out.println("Enter the Amount To WithDraw :");
			double amount = sc.nextDouble();
		
			

		}

	}

}
