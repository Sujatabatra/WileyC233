package com.sujata.presentation;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.entity.Employee;
import com.sujata.service.EmployeeService;

@Component
public class EmployeePresentationImpl implements EmployeePresentation {

	@Autowired
	private EmployeeService employeeService;
	
	@Override
	public void showMenu() {
		System.out.println("1. Insert Employee ");
		System.out.println("2. Delete Employee ");
		System.out.println("3. Show All Employees ");
		System.out.println("4. Search Employee By ID ");
		System.out.println("5. Increment Salary");
		System.out.println("6. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		int id=0;
		
		switch(choice){
		case 1:
			Employee employee=new Employee();
			
			System.out.println("Enter Employee ID : ");
			employee.setEmpId(scanner.nextInt());
			
			System.out.println("Enter Employee Name : ");
			employee.setEmpName(scanner.next());
			
			System.out.println("Enter Employee Designation : ");
			employee.setEmpDesignation(scanner.next());
			
			System.out.println("Enter Employee Department : ");
			employee.setEmpDepartment(scanner.next());
			
			System.out.println("Enter Employee Salary : ");
			employee.setEmpSalary(scanner.nextDouble());
			
			if(employeeService.insertEmployee(employee))
				System.out.println("Employee added Sucessfully");
			else
				System.out.println("Employee Insertion Failed");
			break;
		case 2:
			System.out.println("Enter Employee Id : ");
			id=scanner.nextInt();
			if(employeeService.deleteEmployee(id))
				System.out.println("Employee Deleted!");
			else
				System.out.println("Employee Not Deleted as employee id "+id+" does not exist");
			break;
		case 3:
			List<Employee> employees=employeeService.getAllEmployees();
			for(Employee emp:employees) {
				System.out.println(emp);
			}
			break;
		case 4:
			System.out.println("Enter Employee Id : ");
			id=scanner.nextInt();
			Optional<Employee> emp=employeeService.getEmployeeById(id);
			if(emp.isPresent())
				System.out.println(emp.get());
			else
				System.out.println("Employee with id "+id+"does not exist");
			break;
		case 5:
			System.out.println("Enter Employee Id : ");
			id=scanner.nextInt();
			System.out.println("Enter Increment on Salary : ");
			double increment=scanner.nextDouble();
			if(employeeService.incrementSalary(id, increment))
				System.out.println("Salary Incremented Sucessfully!");
			else
				System.out.println("Salary Can't be Incremented!");
			break;
		case 6:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice Entered");
		}

	}

}
