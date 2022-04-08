package com.sujata.persistence;

import java.util.Optional;

import com.sujata.entity.Employee;

public interface EmployeeDao {

	Optional<Employee> getEmployeeById(int id);
	
}
