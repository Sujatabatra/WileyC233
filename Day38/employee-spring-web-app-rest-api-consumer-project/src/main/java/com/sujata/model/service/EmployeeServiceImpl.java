package com.sujata.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.datatype.jdk8.OptionalDoubleSerializer;
import com.sujata.entity.Employee;
import com.sujata.entity.EmployeeList;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Optional<Employee> searchEmployeeById(int empId) {
		Employee emp=restTemplate.getForObject("http://localhost:8084/employees/"+empId, Employee.class);
		return Optional.ofNullable(emp);
	}

	@Override
	public boolean deleteEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addEmployee(Employee employee) {
		Employee emp=restTemplate.postForObject("http://localhost:8084/employees", employee, Employee.class);
		if(emp!=null)
			return true;
		return false;
	}

	@Override
	public List<Employee> getAllEmployees() {
		EmployeeList employeeList=restTemplate.getForObject("http://localhost:8084/employees", EmployeeList.class);
		return employeeList.getEmployees();
	}

	@Override
	public boolean incrementSalaryById(int empId, double increment) {
		// TODO Auto-generated method stub
		return false;
	}

}
