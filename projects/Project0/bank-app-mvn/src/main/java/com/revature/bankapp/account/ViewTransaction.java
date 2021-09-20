package com.revature.bankapp.account;

import java.sql.SQLException;

import com.revature.bankapp.dao.impl.TransactionDaoImpl;

public class ViewTransaction {
	
	public static Transaction transactionList() {
		
			System.out.println("Transaction list");
			
			int i = 1;
			try {
				for (Transaction transaction : TransactionDaoImpl.transactionList()) {

					System.out.println((i) + "} " +" Type =  "+transaction.getType() +"  Amount = "+ transaction.getAmount());
					i+=1;
					
					

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;

		}
		

}
