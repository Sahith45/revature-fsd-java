
package com.revature.bankapp.account;

import java.sql.SQLException;

import com.revature.bankapp.dao.impl.EmployeeDaoImpl;
import com.revature.bankapp.model.Customer;

public class ViewCustomer {

	public static Customer customerList() {
		EmployeeDaoImpl emp = new EmployeeDaoImpl();
		System.out.println("Customer List");
		int i = 1;
		try {
			for (Customer customer : emp.viewCustomer()) {

				System.out.println((i) + "} " + " FirstName =  " + customer.getFirstName() + "  LastName = "
						+ customer.getLastName() +  " Email =  " + customer.getEmail() + " PhoneNumber =  " + customer.getPhoneNumber());
				i += 1;


			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}





