package com.revature.bankapp.dao;

import java.sql.SQLException;
import java.util.List;


public interface EmployeeDao<Customer> {
	
 List<Customer> viewCustomer() throws SQLException;
	
	

}
