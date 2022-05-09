package com.sujata.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.sujata.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> getAllRecords() {
		List<Employee> empList = new ArrayList<>();

		Statement statement = null;
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc233", "root",
				"sujata");) {

			Class.forName("com.mysql.cj.jdbc.Driver");

			statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery("SELECT * FROM EMPLOYEE");

			while (resultSet.next()) {
				int id = resultSet.getInt("empId");
				String name = resultSet.getString("empName");
				String desig = resultSet.getString("designation");
				String deptt = resultSet.getString("department");
				double sal = resultSet.getDouble("salary");
				Employee employee = new Employee(id, name, desig, deptt, sal);
				empList.add(employee);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return empList;
	}

	@Override
	public Optional<Employee> getRecordById(int id) {
		Employee employee = null;
		PreparedStatement preparedStatement = null;
		Connection connection=null;
		try  {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc233", "root",
					"sujata");
//			connection.setAutoCommit(false);
			
			preparedStatement = connection.prepareStatement("SELECT * FROM EMPLOYEE WHERE EMPID=?");

			preparedStatement.setInt(1, id);

			ResultSet resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				int eid = resultSet.getInt("empId");
				String name = resultSet.getString("empName");
				String desig = resultSet.getString("designation");
				String deptt = resultSet.getString("department");
				double sal = resultSet.getDouble("salary");
				employee = new Employee(eid, name, desig, deptt, sal);

			}
			
//			connection.commit();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
//			connection.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
//			connection.rollback();
		}
		Optional<Employee> optionalEmployee = Optional.ofNullable(employee);
		return optionalEmployee;
	}

	@Override
	public int deleteRecordById(int id) {
		
		int rows = 0;
		PreparedStatement preparedStatement = null;
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc233", "root",
				"sujata");) {
			Class.forName("com.mysql.cj.jdbc.Driver");

			preparedStatement = connection.prepareStatement("DELETE FROM EMPLOYEE WHERE EMPID=?");

			preparedStatement.setInt(1, id);

			rows = preparedStatement.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rows;

	}

	@Override
	public int incrementSalaryById(int id, int increment) {
		int rows = 0;
		PreparedStatement preparedStatement = null;
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc233", "root",
				"sujata");) {
			Class.forName("com.mysql.cj.jdbc.Driver");

			preparedStatement = connection.prepareStatement("UPDATE EMPLOYEE SET SALARY=SALARY+? WHERE EMPID=?");

			preparedStatement.setInt(1, increment);
			preparedStatement.setInt(2, id);

			rows = preparedStatement.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rows;
	}

}
