package com.sujata.demo;

import java.util.Optional;
import java.util.Scanner;

import com.sujata.bl.EmployeeBussinessLogic;
import com.sujata.entity.Employee;

public class EmployeeMain {

	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		EmployeeBussinessLogic employeeBussinessLogic=new EmployeeBussinessLogic();
		System.out.println("Enter Employee ID ");
		int id=scanner.nextInt();
		
		Optional<Employee> optional=employeeBussinessLogic.getEmployeeById(id);
		
		Employee emp=optional.orElseGet(()-> new Employee());
		System.out.println(emp.getEmpId()+" "+emp.getEmpName());
//		Employee employee=employeeBussinessLogic.searchEmployeeById(id);
//		System.out.println(employee.getEmpId()+" "+employee.getEmpName());
	}
}
