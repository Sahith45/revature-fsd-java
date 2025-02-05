package com.revature.bankapp.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.bankapp.dao.impl.CustomerDaoImpl;
import com.revature.bankapp.form.CustomerLogin;
import com.revature.bankapp.form.EmployeeLogin;
import com.revature.bankapp.model.Customer;

public class CustomerMenu extends Menu {

	public CustomerMenu(String name) {
                      		super(name);
		addMenuItem("Register new Customer");
		addMenuItem("Login as Customer");
		addMenuItem("Login as Employee");
		addMenuItem("Exit");
	}

	@Override
	void handleAction() {
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
				customer.create( new Customer(firstName, lastName, email, password,phoneNumber));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Customer added successfully.");
			displayMenuAndCaptureSelection();
			break;
		case 2:
			CustomerLogin loginForm = new CustomerLogin(" Customer Login Form");
			loginForm.captureDataAndPerformAction();
			break;
			
		case 3:
			EmployeeLogin elog = new EmployeeLogin("Employee Login form");
			elog.captureDataAndPerformAction();
			
			break;
			
		case 4:
			System.out.println("Thank you!!!!!!!!!");
			break;
		}
		
	}
}
