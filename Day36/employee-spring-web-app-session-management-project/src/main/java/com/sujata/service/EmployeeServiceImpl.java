package com.sujata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.entity.Employee;
import com.sujata.persistence.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Optional<Employee> searchEmployeeById(int empId) {
		return employeeDao.findById(empId);
	}

	@Override
	public boolean deleteEmployeeById(int empId) {
		try {
			employeeDao.deleteById(empId);
			return true;
		} catch (Exception exception) {
			return false;
		}
	}

	@Override
	public boolean addEmployee(Employee employee) {
		try {
			employeeDao.save(employee);
			return true;
		} catch (Exception exception) {
			return false;
		}
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public boolean incrementSalaryById(int empId, double increment) {
		// TODO Auto-generated method stub
		return false;
	}

}
