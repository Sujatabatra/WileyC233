package com.sujata.demo;

import java.util.Scanner;

/*
 * default import
 * import java.lang.System;
 */


public class UserInput {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter no : ");
		int number=scanner.nextInt();
		System.out.println("Number entered : "+number);

	}

}
