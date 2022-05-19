package com.sujata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.sujata.entity.Employee;
import com.sujata.persistence.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeDao.findAll();
		return employees;
	}

	@Override
	public Optional<Employee> getEmployeeById(int empId) {
		return employeeDao.findById(empId);
	}

	@Override
	public Employee deleteEmployee(int empId) {
		Optional<Employee> emplOptional = employeeDao.findById(empId);
		if (emplOptional.isPresent())
			employeeDao.deleteById(empId);
		return emplOptional.orElse(null);

	}

	@Override
	public Employee insertEmployee(Employee employee) {

		return employeeDao.save(employee);

	}

	@Override
	public Employee incrementSalary(int id, double increment) {
		Optional<Employee> emplOptional = employeeDao.findById(id);
		if (emplOptional.isPresent()) {
			employeeDao.updateSalary(id, increment);
			Employee emp=emplOptional.get();
			emp.setEmpSalary(emp.getEmpSalary()+increment);
			return emp;
			
		}
			return null;
		
	}

}
