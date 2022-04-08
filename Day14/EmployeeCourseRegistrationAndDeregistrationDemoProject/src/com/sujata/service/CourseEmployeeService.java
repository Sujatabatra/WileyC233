package com.sujata.service;

import java.util.List;

import com.sujata.entity.Employee;

public interface CourseEmployeeService {

	boolean registerEmployeeForCourse(int employeeId,int courseId);
	List<Employee> getEmployeeByCourse(int id);
}
