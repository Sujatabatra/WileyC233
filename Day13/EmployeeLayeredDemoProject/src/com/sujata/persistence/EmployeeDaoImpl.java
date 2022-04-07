package com.sujata.persistence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.sujata.database.EmployeeDataBase;
import com.sujata.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> getAllRecords() {
		Collection<Employee> employees=EmployeeDataBase.getEmployeeList().values();
		List<Employee> empList=new ArrayList<>(employees);
		return empList;
	}

	@Override
	public Optional<Employee> getRecordById(int id) {
		Employee employee=EmployeeDataBase.getEmployeeList().get(id);
		Optional<Employee> optionalEmployee=Optional.ofNullable(employee);
		return optionalEmployee;
		
//		return Optional.ofNullable(EmployeeDataBase.getEmployeeList().get(id));
	}

	@Override
	public Optional<Employee> deleteRecordById(int id) {
		Employee employee=EmployeeDataBase.getEmployeeList().remove(id);
		return Optional.ofNullable(employee);
		
	}

	@Override
	public Optional<Employee> incrementSalaryById(int id, int increment) {
		Employee employee=EmployeeDataBase.getEmployeeList().get(id);
		
		if(employee!=null) {
			employee.setEmpSalary(employee.getEmpSalary()+increment);
			EmployeeDataBase.getEmployeeList().put(id, employee);
		}
		return Optional.ofNullable(employee);
	}

}
