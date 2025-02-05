package com.revature.bankapp.form;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.bankapp.dao.impl.CustomerDaoImpl;
import com.revature.bankapp.menu.CustomerMainMenu;
import com.revature.bankapp.model.Customer;

public class CustomerLogin extends Form {
	private String email;
	private String password;

	public CustomerLogin(String name) {
		super(name);
	}

	@Override
	public void captureData() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Email: ");
		email = scanner.nextLine();
		
		System.out.print("Password: ");
		password = scanner.nextLine();
	}

	@Override
	public void action() {
		CustomerDaoImpl customerdao = new CustomerDaoImpl();
		Customer customer;
		try {
			customer = customerdao.getCustomerEmail(email);
			if (customer == null) {
				System.out.println("Invalid email / password");
			} else if (customer.getPassword().equals(password)) {
				success = true;
				System.out.println("Login Successful.");
				System.out.println("Welcome " + customer.getFirstName());
				CustomerMainMenu menu = new CustomerMainMenu("Customer Main Menu");
				menu.displayMenuAndCaptureSelection();
				
			} else {
				System.out.println("Invalid email / password");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}