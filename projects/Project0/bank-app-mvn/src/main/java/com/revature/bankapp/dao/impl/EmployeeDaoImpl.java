package com.revature.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.bankapp.account.Account;
import com.revature.bankapp.dao.CustomerDao;
import com.revature.bankapp.dao.EmployeeDao;
import com.revature.bankapp.dao.Util;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	public Employee getEmployeeUserName(String userName) throws SQLException {
		Employee employee = null;
		
		try (Connection connection = Util.getConnection()){
			String sql = "select * from admin where userName = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, userName);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				String name = resultSet.getString("name");
				String username = resultSet.getString("userName");
				String password = resultSet.getString("password");
				
				employee = new Employee(name, username, password);
			}
		}
		return employee;
	}

	@Override
	public List<Customer> viewCustomer() throws SQLException {
		List<Customer> customerList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select * from customer";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				Customer customerTemp = new Customer();
				customerTemp.setFirstName(resultSet.getString("firstName"));
				customerTemp.setLastName(resultSet.getString("lastname"));
				customerTemp.setEmail(resultSet.getString("email"));
				customerTemp.setPassword(resultSet.getString("password"));
				customerTemp.setPhoneNumber(resultSet.getString("phoneNumber"));
				
				customerList.add(customerTemp);
			}
		return customerList;
		}
		
	}

	/*	@Override
	public List viewAccount() throws SQLException {
		List<Account> accountList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select c.id, c.name, account_number, initial_amount from account\r\n" + 
					"inner join customer c on customer_id = c.id";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Account accountTemp = new Account();
				accountTemp.setCustomerId(resultSet.getInt("id"));
				accountTemp.setName(resultSet.getString("name"));
				accountTemp.setAccountNumber(resultSet.getString("account_number"));
				accountTemp.setInitialAmount(resultSet.getDouble("initial_amount"));
				accountList.add(accountTemp);

			}
		}
		return accountList;
		return null;
	}

	@Override
	public List viewTransaction() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}*/

	

}
