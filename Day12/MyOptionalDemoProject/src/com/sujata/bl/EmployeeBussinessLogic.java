package com.sujata.bl;

import java.util.Optional;

import com.sujata.db.EmployeeDataBase;
import com.sujata.entity.Employee;

public class EmployeeBussinessLogic {

	public Employee searchEmployeeById(int id) {
		return EmployeeDataBase.getEmployeeList().get(id);
	}
	
	public Optional<Employee> getEmployeeById(int id){
		Employee employee=EmployeeDataBase.getEmployeeList().get(id);
		
		return Optional.ofNullable(employee);
	}
}
