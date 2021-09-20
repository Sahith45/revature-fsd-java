package com.revature.bankapp.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.bankapp.account.Account;
import com.revature.bankapp.account.ViewAccount;
import com.revature.bankapp.dao.impl.AccountDaoImpl;
import com.revature.bankapp.form.CustomerLogin;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.DataManager;

public class CustomerMainMenu extends Menu {

	public CustomerMainMenu(String name) {
		super(name);
		addMenuItem("View Accounts");
		addMenuItem("Create Account");
		addMenuItem("Withdraw-Deposit");
		addMenuItem("Return");
		addMenuItem("Exit");
	}

	@Override
	void handleAction() {
		AccountDaoImpl account = new AccountDaoImpl();
		Scanner scanner = new Scanner(System.in);
		switch (selection) {
		case 1:
			ViewAccount.accountList();
			displayMenuAndCaptureSelection();

			break;

		case 2:
			System.out.println("====\n");
			System.out.println("Create Account");
			System.out.println("====\n");

			System.out.print("Account Number: ");
			String accountNumber = scanner.nextLine();

			System.out.print("Min Balance: ");
			double balance = scanner.nextDouble();
			
            
			try {
				account.create(new Account(accountNumber, balance));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Account added successfully.");
			displayMenuAndCaptureSelection();

			break;
		case 3 :
			System.out.println("");
			TransactionMenu tm = new TransactionMenu("Transaction menu");
			tm.getAccount();
		    tm.displayMenuAndCaptureSelection();	
		    break;
	
	

		case 4:
			CustomerMenu menu = new CustomerMenu("Returned to main menu");
			menu.displayMenuAndCaptureSelection();
			break;

		case 5:
			System.out.println("Thank you Visit again");
			break;

		}

	}

}
