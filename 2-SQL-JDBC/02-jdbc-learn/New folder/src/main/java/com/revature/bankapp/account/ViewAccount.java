package com.revature.bankapp.account;

import java.util.ArrayList;
import java.util.List;

import com.revature.bankapp.model.DataManager;

public class ViewAccount {

	public static Account accountList() {
			System.out.println("Account No        Balance");
			//for (int i=0;i < DataManager.accList.size();i++) {
			//	System.out.println( i + "] " +  Account.getAccountNumber());
			//}
			int i = 1;
			for(Account account : DataManager.accList ) {
				
			System.out.println(  account.getAccountNumber() +  "                  "  +  account.getBalance()  );
			
			
	
				i++;
			}
			return null;
		
			
		
	
	

		
			
		}
}
