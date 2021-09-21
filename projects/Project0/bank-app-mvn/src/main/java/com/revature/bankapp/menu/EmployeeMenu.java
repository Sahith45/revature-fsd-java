package com.revature.bankapp.menu;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.revature.bankapp.account.Account;
import com.revature.bankapp.account.Transaction;
import com.revature.bankapp.account.ViewAccount;
import com.revature.bankapp.account.ViewCustomer;
import com.revature.bankapp.account.ViewTransaction;
import com.revature.bankapp.dao.impl.AccountDaoImpl;
import com.revature.bankapp.dao.impl.CustomerDaoImpl;
import com.revature.bankapp.dao.impl.EmployeeDaoImpl;
import com.revature.bankapp.model.Customer;

public class EmployeeMenu extends Menu {
	Scanner scanner = new Scanner(System.in);

	public EmployeeMenu(String name) {
		super(name);
		addMenuItem("Register for Customer account");
		addMenuItem("View Customers");
		addMenuItem("View Accounts");
		addMenuItem("View Transactions");
		//addMenuItem("Pending Accounts");
		addMenuItem("Logout");

	}

	@Override
	void handleAction() {

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
				//System.out.println("Customer List::");
				ViewCustomer.customerList();
				displayMenuAndCaptureSelection();
				break;
				
				
				
			case 3:
				try {
					List<Account> list = EmployeeDaoImpl.eViewAccount();
					for(int i =0; i <list.size(); i++) {
						System.out.println((i+1) + ") " + list.get(i));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				displayMenuAndCaptureSelection();
				break;
			case 4:
				try {
					List<Transaction> list = EmployeeDaoImpl.eViewTransaction();
					for(int i =0; i <list.size(); i++) {
						System.out.println((i+1) + ") " + list.get(i));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				displayMenuAndCaptureSelection();
				break;
				
				
			/*case 5:
				displayMenuAndCaptureSelection();
				break;*/
			case 5:
				 System.out.println("Logged Out");
				    break;
			}

				
			}

		}


