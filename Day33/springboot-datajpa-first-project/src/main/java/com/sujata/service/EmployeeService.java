package com.sujata.service;

import java.util.List;
import java.util.Optional;



import com.sujata.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	Optional<Employee> getEmployeeById(int empId);
	boolean deleteEmployee(int empId);
	boolean insertEmployee(Employee employee);
	boolean incrementSalary(int id,double increment);
	
}
