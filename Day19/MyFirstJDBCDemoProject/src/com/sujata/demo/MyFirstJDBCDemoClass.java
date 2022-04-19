package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJDBCDemoClass {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
//			1. Connect
//			1.1 Register The driver
			Class.forName("com.mysql.cj.jdbc.Driver");
//			1.2 Connect to Database
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc233", "root", "sujata");
			
//			2.Query
			statement = connection.createStatement();
			// for dql always use executeQuery
			ResultSet resultSet = statement.executeQuery("SELECT * FROM EMPLOYEE");

//			3.Process Result
			while (resultSet.next()) {
				int id = resultSet.getInt("empId");
				String name = resultSet.getString("empName");
				String desig = resultSet.getString("designation");
				String deptt = resultSet.getString("department");
				double sal = resultSet.getDouble("salary");
				System.out.println(id + "  " + name + "  " + desig + "  " + deptt + "  " + sal);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
//				4.Close the connection
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
