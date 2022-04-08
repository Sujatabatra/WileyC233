package com.sujata.persistence;

import java.util.List;

import com.sujata.entity.Course;
import com.sujata.entity.Employee;

public interface CourseEmployeeDao {

	boolean addEmployeeToSpecificCourse(Course course,Employee employee);
	
	boolean deleteEmployeeFromSpecificCourse(Course course,Employee employee);
	
	List<Employee> getEmployeeListRegisteredForSpecificCourse(Course course);
}
