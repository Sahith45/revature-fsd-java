package com.revature.bankapp.account;

import java.util.ArrayList;
import java.util.List;

import com.revature.bankapp.model.DataManager;

public class ViewAccount {

	public static Account accountList() {
			System.out.println("your accounts and balance");
			//for (int i=0;i < DataManager.accList.size();i++) {
			//	System.out.println( i + "] " +  Account.getAccountNumber());
			//}
			int i = 1;
			for (Account account : DataManager.accList) {

				System.out.println((i) + "} " +" Account Number =  "+account.getAccountNumber() +"  Balance = "+ account.getBalance());
				i+=1;
				
				

			}
			return null;

		}
				
		
	
	

		
			
		}

