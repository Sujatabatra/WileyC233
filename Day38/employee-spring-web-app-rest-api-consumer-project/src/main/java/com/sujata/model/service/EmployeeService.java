package com.sujata.model.service;

import java.util.List;
import java.util.Optional;

import com.sujata.entity.Employee;

public interface EmployeeService {

	Optional<Employee> searchEmployeeById(int empId);
	boolean deleteEmployeeById(int empId);
	boolean addEmployee(Employee employee);
	List<Employee> getAllEmployees();
	boolean incrementSalaryById(int empId,double increment);
}
