package com.revature.bankapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.bankapp.account.Account;
import com.revature.bankapp.account.Transaction;

public interface EmployeeDao<Customer> {
	
 List<Customer> viewCustomer() throws SQLException;
	
	

}
