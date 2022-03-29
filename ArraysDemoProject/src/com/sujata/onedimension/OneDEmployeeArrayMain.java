package com.sujata.onedimension;

import java.util.Scanner;

import com.sujata.entity.Employee;

public class OneDEmployeeArrayMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Total No of Employees : ");
		int totalEmployees=scanner.nextInt();
		
		OneDEmployeeArray employees=new OneDEmployeeArray(totalEmployees);
		
//		for(int index=0;index<employees.getTotalNoOfElements();index++) {
//			Employee employee=employees.getElementFromLocation(index);
//			employee=new Employee();
//			System.out.println("Enter Employee Id for "+(index+1)+" employee : ");
//			employee.setEmpId(scanner.nextInt());
//			System.out.println("Enter Employee Name for "+(index+1)+" employee : ");
//			employee.setEmpName(scanner.next());
//			System.out.println("Enter Employee Designation for "+(index+1)+" employee : ");
//			employee.setEmpDesignation(scanner.next());
//			System.out.println("Enter Employee Department for "+(index+1)+" employee : ");
//			employee.setEmpDepartment(scanner.next());
//			System.out.println("Enter Employee Salary for "+(index+1)+" employee : ");
//			employee.setEmpSalary(scanner.nextDouble());
//		}
		
		for(int index=0;index<employees.getTotalNoOfElements();index++) {
			
			System.out.println("Enter Employee Id for "+(index+1)+" employee : ");
			int id=scanner.nextInt();
			System.out.println("Enter Employee Name for "+(index+1)+" employee : ");
			String name=scanner.next();
			System.out.println("Enter Employee Designation for "+(index+1)+" employee : ");
			String designation=scanner.next();
			System.out.println("Enter Employee Department for "+(index+1)+" employee : ");
			String department=scanner.next();
			System.out.println("Enter Employee Salary for "+(index+1)+" employee : ");
			double salary=scanner.nextDouble();
			
			Employee employee=new Employee(id, name, designation, department, salary);
			
			employees.setElementAtLocation(employee, index);
		}
		
		for(Employee emp:employees.getArr()) {
			System.out.println(emp); //implicit call to the toString() method of Object Class : toString() returns absoluteclassName@hashcode
		}

	}

}
