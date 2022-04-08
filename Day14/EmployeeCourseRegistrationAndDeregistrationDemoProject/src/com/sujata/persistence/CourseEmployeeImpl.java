package com.sujata.persistence;

import java.util.ArrayList;
import java.util.List;

import com.sujata.database.CourseEmployeeDatabase;
import com.sujata.entity.Course;
import com.sujata.entity.Employee;

public class CourseEmployeeImpl implements CourseEmployeeDao {

	@Override
	public boolean addEmployeeToSpecificCourse(Course course, Employee employee) {
		List<Employee> employees=CourseEmployeeDatabase.getCourseEmployeeList().get(course);
		//if no employee is registered for course
		if(employees==null)
			employees=new ArrayList<Employee>();
		//if employee already registered for course
		if(employees.contains(employee))
			return false;
		employees.add(employee);
		
		CourseEmployeeDatabase.getCourseEmployeeList().put(course, employees);
		
		return true;
	}

	@Override
	public boolean deleteEmployeeFromSpecificCourse(Course course, Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> getEmployeeListRegisteredForSpecificCourse(Course course) {
		return CourseEmployeeDatabase.getCourseEmployeeList().get(course);
	}

}
