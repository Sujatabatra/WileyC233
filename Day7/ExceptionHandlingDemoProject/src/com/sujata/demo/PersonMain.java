package com.sujata.demo;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
		System.out.println("Enter Person Age : ");
		int age=scanner.nextInt();
		
		Person person=new Person(age);
		
		System.out.println("Person is adult");
		}
		catch (AgeCheckedException ageCheckedException) {
			System.out.println("Person is minor");
		}
		
		
		Person person=new Person();
		System.out.println("Enter person age ");
		person.setAge(scanner.nextInt());
		System.out.println("Person's age is : "+person.getAge());
	}

}
