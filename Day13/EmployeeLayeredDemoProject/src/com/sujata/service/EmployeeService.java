package com.sujata.service;

import java.util.List;
import java.util.Optional;

import com.sujata.entity.Employee;
import com.sujata.entity.PaySlip;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	Optional<Employee> searchEmployeeById(int empId);
	Optional<PaySlip> generateEmployeePaySlip(int empId);
}
