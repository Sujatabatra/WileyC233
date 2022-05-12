package com.sujata.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sujata.presentation.EmployeePresentation;

@SpringBootApplication(scanBasePackages = "com.sujata")
public class SpringbootJdbcEmployeeLayeredProjectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(SpringbootJdbcEmployeeLayeredProjectApplication.class, args);
		Scanner scanner=new Scanner(System.in);
		EmployeePresentation employeePresentation=(EmployeePresentation)springContainer.getBean("empPresentation");

		while (true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			employeePresentation.performChoice(choice);
		}

	
	}

}
