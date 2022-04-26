package com.sujata.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeStreamExampleClass {

	public static void main(String[] args) {
		List<Employee> empList=Arrays.asList(new Employee(101, "AAAA", "Executive", "Sales", 25000),
				new Employee(102, "BBBB", "Associate", "IT", 50000),
				new Employee(103, "CCCC", "Manager", "Sales", 250000),
				new Employee(104, "DDDD", "Sr. Associate", "HR", 150000),
				new Employee(105, "EEEE", "Executive", "IT", 35000),
				new Employee(106, "FFFF", "Manager", "HR", 125000));
		
		Map<String,Double> emps=empList.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary)));

		System.out.println(emps);
	}

}
