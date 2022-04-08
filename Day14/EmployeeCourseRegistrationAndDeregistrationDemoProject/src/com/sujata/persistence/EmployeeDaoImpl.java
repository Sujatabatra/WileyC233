package com.sujata.persistence;

import java.util.Optional;

import com.sujata.database.EmployeeDatabase;
import com.sujata.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Optional<Employee> getEmployeeById(int id) {
		return Optional.ofNullable(EmployeeDatabase.getEmployeeList().get(id));
	}

}
