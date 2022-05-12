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

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sujata.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private DataSource dataSource;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<Employee> getAllRecords() {
		List<Employee> empList = new ArrayList<>();

		Connection connection = null;
		Statement statement = null;
		try {

			connection = dataSource.getConnection();

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

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return empList;
	}

	@Override
	public Optional<Employee> getRecordById(int id) {
		Employee employee = null;
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		try {
			connection = dataSource.getConnection();

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

		} catch (SQLException e) {
			e.printStackTrace();

		}
		Optional<Employee> optionalEmployee = Optional.ofNullable(employee);
		return optionalEmployee;
	}

	@Override
	public int deleteRecordById(int id) {

		int rows = 0;
		PreparedStatement preparedStatement = null;
		Connection connection=null;
		try  {
			
			connection=dataSource.getConnection();
			preparedStatement = connection.prepareStatement("DELETE FROM EMPLOYEE WHERE EMPID=?");

			preparedStatement.setInt(1, id);

			rows = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rows;

	}

	@Override
	public int incrementSalaryById(int id, int increment) {
		int rows = 0;
		PreparedStatement preparedStatement = null;
		Connection connection=null;
		try {
			connection=dataSource.getConnection();

			preparedStatement = connection.prepareStatement("UPDATE EMPLOYEE SET SALARY=SALARY+? WHERE EMPID=?");

			preparedStatement.setInt(1, increment);
			preparedStatement.setInt(2, id);

			rows = preparedStatement.executeUpdate();

		}catch (SQLException e) {
			e.printStackTrace();
		}

		return rows;
	}

}
