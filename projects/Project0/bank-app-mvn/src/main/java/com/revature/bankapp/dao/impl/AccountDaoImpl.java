package com.revature.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.bankapp.account.Account;
import com.revature.bankapp.account.Transaction;
import com.revature.bankapp.dao.AccountDao;
import com.revature.bankapp.dao.Util;
import com.revature.bankapp.menu.TransactionMenu;

public class AccountDaoImpl implements AccountDao {
	CustomerDaoImpl customer = new CustomerDaoImpl();

	public static int currentAccountId;
	public static int transferAccountId;

	@Override
	public void create(Account account) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "insert into account (accountnumber, balance,customerid) values (?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, account.getAccountNumber());
			statement.setDouble(2, account.getBalance());
			statement.setInt(3,CustomerDaoImpl.currentCustomerId);
			// statement.setString(4, String.valueOf('N'));
			statement.executeUpdate();
		}

	}

	public List<Account> accountList() throws SQLException {
		List<Account> accountList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select * from account where customerid = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setInt(1, customer.currentCustomerId);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Account account = new Account();
				account.setAccountNumber(resultSet.getString("accountnumber"));
				account.setBalance(resultSet.getDouble("balance"));
				accountList.add(account);

			}

			return accountList;

		}
		
	}
	
	TransactionMenu tmenu = new TransactionMenu("Transaction Menu");
	public Account currentAccount() throws SQLException {
		Account account = null;
		try (Connection connection = Util.getConnection()) {
			String sql = "select * from account where accountnumber = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1,tmenu.accNumber);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				currentAccountId = resultSet.getInt("id");
				String accNumber = resultSet.getString("accountnumber");
				Double balance = resultSet.getDouble("balance");

				account = new Account(accNumber,balance);
			}
		}
		return account;
	}
	
	
	
	
	
}