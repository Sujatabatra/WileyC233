package com.sujata.database;

import java.util.*;

import com.sujata.entity.*;

public class CourseEmployeeDatabase {
	static private Map<Course, List<Employee>> courseEmployeeList = new HashMap<>();
	
	
	static {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(101, "AAAA", "Sales", "Executive"));
		employeeList.add(new Employee(104, "DDDD", "Sales", "Sr. Executive"));
		courseEmployeeList.put(new Course(1, "Java", 1000, "classroom", "full time") , employeeList); 
	}

	public static Map<Course, List<Employee>> getCourseEmployeeList() {
		return courseEmployeeList;
	}

	public static void setCourseEmployeeList(Map<Course, List<Employee>> courseEmployeeList) {
		CourseEmployeeDatabase.courseEmployeeList = courseEmployeeList;
	}
	
	
}
