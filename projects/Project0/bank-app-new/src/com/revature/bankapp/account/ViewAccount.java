package com.revature.bankapp.account;

import java.util.ArrayList;
import java.util.List;

public class ViewAccount  extends Account{
	protected static List<String> accList ;


	public ViewAccount(String name) {
		super(name);
	
		accList = new ArrayList<>();
		
	}
	
	public static void displayAccounts() {
		for(String accounts : accList ) {
			System.out.println("the accounts " + accounts);
		}
	}

}
