package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MySecondJDBCDemoClass {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		Scanner scanner=new Scanner(System.in);
		try {
//			1. Connect
//			1.1 Register The driver
			Class.forName("com.mysql.cj.jdbc.Driver");
//			1.2 Connect to Database
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc233", "root", "sujata");
			
			System.out.println("Enter Employee ID : ");
			int id=scanner.nextInt();
			System.out.println("Enter Employee Name : ");
			String name=scanner.next();
			System.out.println("Enter Employee Designation : ");
			String designation=scanner.next();
			System.out.println("Enter Employee Department : ");
			String deptt=scanner.next();
			System.out.println("Enter Employee Salary : ");
			double salary=scanner.nextDouble();
			
//			2.Query
			statement = connection.createStatement();
			
			String query="INSERT INTO EMPLOYEE VALUES("+id+",'"+name+"','"+designation+"','"+deptt+"',"+salary+")";
			System.out.println(query);
			// for dml always use executeUpdate
			int rows=statement.executeUpdate(query);

//			3.Process Result
			if(rows>0)
				System.out.println("Employee added successfully");
			else
				System.out.println("Employee Addition failed");
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
