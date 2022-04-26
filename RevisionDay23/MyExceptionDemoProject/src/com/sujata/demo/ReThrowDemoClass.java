package com.sujata.demo;

import java.util.Scanner;

public class ReThrowDemoClass {

	public static void divide(int number1,int number2)throws ArithmeticException {
		int result=number1/number2;
		System.out.println("Result : "+result);
	}
	
	public static void input(int number1,int number2) {
		try {
			divide(number1, number2);
		}
		catch (Exception e) {
			System.out.println("Rethrowing");
			throw e;
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("Enter first No : ");
			int n1=scanner.nextInt();
			System.out.println("Enter Second No : ");
			int n2=scanner.nextInt();
			input(n1, n2);
		}
		catch(ArithmeticException ex) {
			System.out.println("Hello:"+ex.getMessage());
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
