package com.sujata.presentation;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.sujata.entity.Employee;
import com.sujata.entity.PaySlip;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {

	private EmployeeService employeeService;
	
	
	public EmployeePresentationImpl(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@Override
	public void showMenu() {
		System.out.println("1. List All Employees");
		System.out.println("2. Search Employee By ID ");
		System.out.println("3. Generate PaySlip By Employee ID");
		System.out.println("4. Delete Employee By ID ");
		System.out.println("5. Salary Increment to an Employee By ID");
		System.out.println("6. Exit");

	}

	@Override
	public void performChoice(int choice) {
		Scanner scanner=new Scanner(System.in);
		int employeeId=0;
		switch (choice) {
		case 1:
			List<Employee> empList=employeeService.getAllEmployees();
			System.out.println("List of Employees");
			empList.stream().forEach(System.out::println);
			break;
		case 2:
			System.out.println("Enter Employee ID : ");
			employeeId=scanner.nextInt();
			Optional<Employee> optionalEmployee=employeeService.searchEmployeeById(employeeId);
			if(optionalEmployee.isPresent())
				System.out.println(optionalEmployee.get());
			else
				System.out.println("Employee with id "+employeeId+" does not exist");
			break;
		case 3:
			System.out.println("Enter Employee ID : ");
			employeeId=scanner.nextInt();
			Optional<PaySlip> employeePaySlip=employeeService.generateEmployeePaySlip(employeeId);
			if(employeePaySlip.isPresent())
				System.out.println(employeePaySlip.get());
			else
				System.out.println("Employee with id "+employeeId+" does not exist");
			break;
		case 4:
			System.out.println("Enter Employee ID : ");
			employeeId=scanner.nextInt();
			if(employeeService.deleteEmployeeById(employeeId))
				System.out.println("Employee with Id "+employeeId+" deleted !");
			else
				System.out.println("Employee with Id "+employeeId+" does not exist");
			break;
		case 5:
			System.out.println("Enter Employeee ID : ");
			employeeId=scanner.nextInt();
			System.out.println("Enter Incremented in the Current Salary : ");
			int increment=scanner.nextInt();
			if(employeeService.incrementSalary(employeeId, increment))
				System.out.println("Increment give to employee "+employeeId);
			else
				System.out.println("Employee with id "+employeeId+" does not exist");
			break;
		case 6:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
			break;
		}

	}

}
