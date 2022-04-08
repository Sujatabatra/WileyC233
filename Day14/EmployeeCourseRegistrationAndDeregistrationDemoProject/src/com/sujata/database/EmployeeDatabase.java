package com.sujata.database;

import java.util.HashMap;
import java.util.Map;
import com.sujata.entity.Employee;

public class EmployeeDatabase {

	static private Map<Integer,Employee> employeeList = new HashMap<>();
	
	static {
		employeeList.put(101, new Employee(101, "AAAA", "Sales", "Executive"));
		employeeList.put(102, new Employee(102, "BBBB", "HR", "Manager"));
		employeeList.put(103, new Employee(103, "CCCC", "Marketing", "Representative"));
		employeeList.put(104, new Employee(104, "DDDD", "Sales", "Sr. Executive"));
		employeeList.put(105, new Employee(105, "EEEE", "IT", "Associate"));
		employeeList.put(106, new Employee(106, "FFFF", "Sales", "Manager"));
		employeeList.put(107, new Employee(107, "GGGG", "HR", "Sr. Executive"));
	}

	public static Map<Integer, Employee> getEmployeeList() {
		return employeeList;
	}

	public static void setEmployeeList(Map<Integer, Employee> employeeList) {
		EmployeeDatabase.employeeList = employeeList;
	}
	
	
}
