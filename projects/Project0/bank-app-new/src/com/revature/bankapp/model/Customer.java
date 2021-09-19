package com.revature.bankapp.model;

import com.revature.bankapp.account.Account;

public class Customer {
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	protected String phoneNumber;
	//private List<Account> accountList;
	
	private static long counter = 0;
	
	public Customer(String firstName, String lastName, String email, String password, String phoneNumber) {
		super();
		counter++;
		this.id = counter;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}

	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String phoneNumber() {
		return phoneNumber;
	}
	
	

}
