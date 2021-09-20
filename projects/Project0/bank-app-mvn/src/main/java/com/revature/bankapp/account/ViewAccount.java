package com.revature.bankapp.account;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.bankapp.dao.impl.AccountDaoImpl;
import com.revature.bankapp.dao.impl.TransactionDaoImpl;
import com.revature.bankapp.menu.CustomerMenu;
import com.revature.bankapp.model.DataManager;

public class ViewAccount {

	public static Account accountList() {
		AccountDaoImpl sh = new AccountDaoImpl();
			System.out.println("your accounts and balance");
			//for (int i=0;i < DataManager.accList.size();i++) {
			//	System.out.println( i + "] " +  Account.getAccountNumber());
			//}
			int i = 1;
			try {
				for (Account account : sh.accountList()) {

					System.out.println((i) + "} " +" Account Number =  "+account.getAccountNumber() +"  Balance = "+ account.getBalance());
					i+=1;
					
					

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;

		}
				
	/*public static ArrayList<Transaction> transactionsList() {

		AccountDaoImpl accdao = new AccountDaoImpl();
		try {
			List<Transaction> transaction = accdao.transactionList();
			for (int i = 0; i < transaction.size(); i++) {
				System.out.println((i + 1) + ") " + transaction.get(i).print());
			}
			CustomerMenu cm = new CustomerMenu("Customer Menu");
			
			cm.displayMenuLoop();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Cannot display accounts");
		}
		return null;
	}
	public static Transaction transactionList() {
		TransactionDaoImpl tdao = new TransactionDaoImpl();
			System.out.println("Transaction list");
			
			int i = 1;
			try {
				for (Transaction transaction : tdao.transactionList()) {

					System.out.println((i) + "} " +" Type =  "+transaction.getType() +"  Amount = "+ transaction.getAmount());
					i+=1;
					
					

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;

		}*/
		
	
	

		
			
		}

