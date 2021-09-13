package com.revature.bankapp.account;
import java.util.ArrayList;
import java.util.List;

import com.revature.bankapp.model.DataManager;

public class ViewAccount  {
	
		
		public static Account accountList() {
			for (int i=0;i < DataManager.accList.size();i++) {
				System.out.println((i + 1) + "] " + Account.getAccountNumber());
			}
			return null;
			
		
	
	

		
			
		}
	}
