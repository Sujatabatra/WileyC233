package com.sujata.client;

import java.util.Scanner;

import com.sujata.presentation.CourseEmployeePresentation;
import com.sujata.presentation.CourseEmployeePresentationImpl;

public class CourseEmployeeClient {

	public static void main(String[] args) {
		CourseEmployeePresentation courseEmployeePresentation=new CourseEmployeePresentationImpl();
		 
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			courseEmployeePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			courseEmployeePresentation.performMenu(choice);
		}

	}

}
