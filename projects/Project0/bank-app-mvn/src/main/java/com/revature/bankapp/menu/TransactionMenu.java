package com.revature.bankapp.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.bankapp.account.ViewAccount;
import com.revature.bankapp.account.ViewTransaction;
import com.revature.bankapp.dao.impl.AccountDaoImpl;
import com.revature.bankapp.dao.impl.TransactionDaoImpl;

public class TransactionMenu extends Menu {
	 public  static String accNumber; 
	 public static String  transferAccNum;
	
	
	Scanner sc = new Scanner(System.in);
	CustomerMainMenu cm = new CustomerMainMenu("Customer Menu");
	
	
	public TransactionMenu(String name) {
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
		AccountDaoImpl accdao = new AccountDaoImpl();
		TransactionDaoImpl trdao = new TransactionDaoImpl();
		
		switch (selection) {

		case 1:
			try {
				System.out.println("Enter amount to withdraw: ");
				double amount = sc.nextDouble();
			accdao.currentAccount().withdraw(amount);
		
			} catch (SQLException e) {
				e.printStackTrace();
			}
			cm.displayMenu();
			break;

		case 2:
			
			try {
				System.out.println("Enter amount to deposit: ");
				double amount = sc.nextDouble();
				accdao.currentAccount().deposit(amount);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			cm.displayMenu();
			break;
			
		case 3:	
			try {
				accdao.currentAccount();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ViewTransaction.transactionList();
			cm.displayMenu();
			break;
			
			case 4:
			try {
				double balance = accdao.currentAccount().getBalance();
				System.out.println("Balance: " + balance);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			cm.displayMenu();
			break;
		
			case 5:
			System.out.println("Enter Account Number of receiver: ");
			transferAccNum = sc.nextLine();
			System.out.println("Enter amount to transfer: ");
			long amount = sc.nextLong();
			try {
				accdao.currentAccount().withdraw(amount);
				System.out.println("Initiated");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("withdraw failed");
			}
			try {
				accdao.transferAccount().transfer(amount);
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("deposit failed");
			}
			cm.displayMenu();
			break;
			
			case 6:
			cm.displayMenu();
			break;
			
		case 7:
			
		    System.out.println("Logged Out");
		    break;
}
		
	}

}
