package com.revature.app.jdbs;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.Statement;	
public class JdbsDemo {

	public static void main(String[] args) {
		try {
			// Driver driver = new Driver
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learndb", "root",
					"Sahith@45");
		System.out.println(connection.getClass().getName());	
			System.out.println("connection successful");
			String sql =" insert into department (name) values ('Innovation')";
			

			Statement statement = connection.createStatement();
			statement.executeUpdate(sql);
			/*String departmentName = "Statistics";
			String sql = "insert into department (name) values ('" + departmentName + "')";
			statement.executeUpdate(sql);
			
			departmentName = "Research";
			sql = "insert into department (name) values ('" + departmentName + "')";
			statement.executeUpdate(sql);
			
			String email = "123@gmail.com' or 1 = 1";
			sql = "select * from user where email = '" + email + "'";
			
			
			sql = "select * from user where email = '123@gmail.com' or 1 = 1";
*/
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
