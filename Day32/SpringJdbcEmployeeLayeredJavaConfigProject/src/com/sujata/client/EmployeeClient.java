package com.sujata.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.entity.Employee;
import com.sujata.presentation.EmployeePresentation;
import com.sujata.presentation.EmployeePresentationImpl;

public class EmployeeClient {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
//		ApplicationContext springContainer=new ClassPathXmlApplicationContext("employeejdbc.xml");
		AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(com.sujata.config.EmployeeConfig.class);
		EmployeePresentation employeePresentation=(EmployeePresentation)springContainer.getBean("empPresentation");

		while (true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			employeePresentation.performChoice(choice);
		}

	}

}
