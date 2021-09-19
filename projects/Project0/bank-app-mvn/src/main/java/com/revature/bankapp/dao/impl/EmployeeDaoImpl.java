package com.revature.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

	

}
