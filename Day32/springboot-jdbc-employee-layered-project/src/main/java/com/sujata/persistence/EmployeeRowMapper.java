package com.sujata.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sujata.entity.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		int eid = resultSet.getInt("empId");
		String name = resultSet.getString("empName");
		String desig = resultSet.getString("designation");
		String deptt = resultSet.getString("department");
		double sal = resultSet.getDouble("salary");
		Employee employee = new Employee(eid, name, desig, deptt, sal);
		return employee;
	}

}
