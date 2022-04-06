package com.sujata.db;

import java.util.HashMap;
import java.util.Map;

import com.sujata.entity.Employee;

public class EmployeeDataBase {

	static private Map<Integer, Employee> employeeList=new HashMap<>();
	
	static {
		employeeList.put(101, new Employee(101, "AAAA", "Sales", "Executive", 15000));
		employeeList.put(102, new Employee(102, "BBBB", "HR", "Manager", 15000));
		employeeList.put(103, new Employee(103, "CCCC", "Marketing", "Representative", 15000));
		employeeList.put(104, new Employee(104, "DDDD", "Sales", "Sr. Executive", 15000));
		employeeList.put(105, new Employee(105, "EEEE", "IT", "Associate", 15000));
		employeeList.put(106, new Employee(106, "FFFF", "Sales", "Manager", 15000));
		employeeList.put(107, new Employee(107, "GGGG", "HR", "Sr. Executive", 15000));
	}

	public static Map<Integer, Employee> getEmployeeList() {
		return employeeList;
	}

	public static void setEmployeeList(Map<Integer, Employee> employeeList) {
		EmployeeDataBase.employeeList = employeeList;
	}
	
	
}
