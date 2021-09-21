package com.revature.bankapp.menu;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.revature.bankapp.account.ViewAccount;
import com.revature.bankapp.account.ViewCustomer;
import com.revature.bankapp.dao.impl.CustomerDaoImpl;
import com.revature.bankapp.dao.impl.EmployeeDaoImpl;
import com.revature.bankapp.model.Customer;

public class EmployeeMenu extends Menu {

	public EmployeeMenu(String name) {
		super(name);
		addMenuItem("Register for Customer account");
		addMenuItem("View Customers");
		addMenuItem("View Accounts");
		addMenuItem("View Transactions");
		addMenuItem("Pending Accounts");
		addMenuItem("Logout");

	}

	@Override
	void handleAction() {

		switch (selection) {
		case 1:
			Scanner scanner = new Scanner(System.in);
			CustomerDaoImpl customer = new CustomerDaoImpl();
			switch (selection) {
			case 1:
				System.out.println("\n---------");
				System.out.println("Register new customer");
				System.out.println("---------\n");

				System.out.print("First Name: ");
				String firstName = scanner.nextLine();

				System.out.print("Last Name: ");
				String lastName = scanner.nextLine();

				System.out.print("Email: ");
				String email = scanner.nextLine();

				System.out.print("Password: ");
				String password = scanner.nextLine();

				System.out.print("Phone Number: ");
				String phoneNumber = scanner.nextLine();

				try {
					customer.create(new Customer(firstName, lastName, email, password, phoneNumber));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Customer added successfully.");
				displayMenuAndCaptureSelection();
				break;
				
			case 2:
				System.out.println("Customer List::");
				ViewCustomer.customerList();
				break;
				
				
				
			case 3:
				System.out.println("Customer Accounts::");
				ViewAccount.accountList();
				displayMenuAndCaptureSelection();

				break;

				
			}

		}
	}
}
