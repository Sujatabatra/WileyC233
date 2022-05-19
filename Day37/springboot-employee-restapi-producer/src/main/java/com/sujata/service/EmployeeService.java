package com.sujata.service;

import java.util.List;
import java.util.Optional;



import com.sujata.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	Optional<Employee> getEmployeeById(int empId);
	Employee deleteEmployee(int empId);
	Employee insertEmployee(Employee employee);
	Employee incrementSalary(int id,double increment);
	
	
	
	
}
