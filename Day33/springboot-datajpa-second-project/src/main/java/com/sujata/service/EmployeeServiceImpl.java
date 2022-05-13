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
	public boolean deleteEmployee(int empId) {
		try {
			employeeDao.deleteById(empId);
			return true;
		} catch (EmptyResultDataAccessException exception) {
			return false;
		}
	}

	@Override
	public boolean insertEmployee(Employee employee) {

		try {
			if (employeeDao.existsById(employee.getEmpId()))
				return false;
			employeeDao.save(employee);
			return true;
		} catch (Exception exception) {
			return false;
		}
	}

	@Override
	public boolean incrementSalary(int id, double increment) {
		try {
			employeeDao.updateSalary(id, increment);
			return true;
		} catch (Exception exception) {
			exception.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Employee> getEmployeeByDepartment(String department) {
		
		return employeeDao.getEmployeesByDepartment(department);
	}

	

}
