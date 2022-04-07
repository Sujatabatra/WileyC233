package com.sujata.persistence;

import java.util.List;
import java.util.Optional;

import com.sujata.entity.Employee;

public interface EmployeeDao {

	List<Employee> getAllRecords();
	Optional<Employee> getRecordById(int id);
}
