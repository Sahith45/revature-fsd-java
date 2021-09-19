package com.revature.app.jdbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class InsertDemoPrepared {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learndb", "root","Sahith@45");
		
		
		  String sql = " insert into department (name) values (?)";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1,"Research");
         	statement.executeUpdate();
         	 
         	statement.setString(1," Statistics");
         	statement.executeUpdate();
         	/*String sql = "insert into employee (name, salary, gender, department_id) values (?, ?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, "Jacob");
			statement.setDouble(2, 1500.0);
			statement.setString(3, "M");
			statement.setInt(4, 2);
			statement.executeUpdate();
*/
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
