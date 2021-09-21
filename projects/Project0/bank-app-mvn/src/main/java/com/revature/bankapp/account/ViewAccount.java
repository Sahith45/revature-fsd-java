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
		// for (int i=0;i < DataManager.accList.size();i++) {
		// System.out.println( i + "] " + Account.getAccountNumber());
		// }
		int i = 1;
		try {
			for (Account account : sh.accountList()) {

				System.out.println((i) + "} " + " Account Number =  " + account.getAccountNumber() + "  Balance = "
						+ account.getBalance());
				i += 1;

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
