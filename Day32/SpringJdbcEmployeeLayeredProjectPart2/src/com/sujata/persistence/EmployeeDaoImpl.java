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

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sujata.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Employee> getAllRecords() {
		String query = "SELECT * FROM EMPLOYEE";

		List<Employee> empList=jdbcTemplate.query(query, new EmployeeRowMapper());

		return empList;
	}

	@Override
	public Optional<Employee> getRecordById(int id) {
		String query="SELECT * FROM EMPLOYEE WHERE EMPID=?";
		Employee employee=null;
		try {
		employee=jdbcTemplate.queryForObject(query, new EmployeeRowMapper(), id);
		}
		catch (EmptyResultDataAccessException e) {
			
		}
		Optional<Employee> optionalEmployee = Optional.ofNullable(employee);
		return optionalEmployee;
	}

	@Override
	public int deleteRecordById(int id) {

		int rows = 0;
		String query = "DELETE FROM EMPLOYEE WHERE EMPID=?";

		rows = jdbcTemplate.update(query, id);

		return rows;

	}

	@Override
	public int incrementSalaryById(int id, int increment) {
		int rows = 0;
		String query = "UPDATE EMPLOYEE SET SALARY=SALARY+? WHERE EMPID=?";

		rows = jdbcTemplate.update(query, increment, id);

		return rows;
	}

}
