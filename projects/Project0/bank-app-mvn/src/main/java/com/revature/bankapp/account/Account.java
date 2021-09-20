package com.revature.bankapp.account;

import java.sql.SQLException;

import com.revature.bankapp.dao.impl.AccountDaoImpl;
import com.revature.bankapp.dao.impl.TransactionDaoImpl;

public class Account {
	
	protected   String accountNumber;
	protected  double balance;
	protected int customerId;
	public Account() {
		
	}
	TransactionDaoImpl tdao = new TransactionDaoImpl();
	
	public Account(String accountNumber, double balance) {
		super();
		
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public double withdraw(double amount) {
		if (balance < amount) {
			System.out.println("Transaction Canont be Implied");}
		else if (balance >= amount) {
			balance -= amount;
			System.out.println(" WithDraw successfull");
			try {
				tdao.insert(new Transaction('w',amount));
				tdao.update(this);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			return balance;
	}
	
	public double deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Transaction Canont be Implied");}
		else if (balance >= amount) {
			balance+=amount;
			System.out.println(" Deposite successfull");
			
			try {
				tdao.insert(new Transaction('d',amount));
				tdao.update(this);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			return balance;
	}
	public void transfer(double amount) {
		balance += amount;
		try {
			AccountDaoImpl.insertTransfer(new Transaction('C', amount));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			AccountDaoImpl.updateTransfer(this);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public  String getAccountNumber() {
		return accountNumber;
	}
	public  double getBalance() {
		return balance;
	}

	public void setBalance(long l) {
		this.balance = l;
	}

	public int getCustomerId() {
		return customerId;
	}


	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", customerId=" + customerId + "]";
	}


	

	
	
	

}
