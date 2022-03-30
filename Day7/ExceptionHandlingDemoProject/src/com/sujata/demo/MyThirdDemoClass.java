package com.sujata.demo;

import java.util.Scanner;

class MyDivide {

	private int number1, number2;

	public MyDivide(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	public void divide() {
		try {
			int divide = number1 / number2;
			System.out.println("Result of Division :" + divide);
		} 
		finally {
			System.out.println("Hi I am finally block of divide");
		}
		System.out.println("Good Bye from Divide");

	}
}

public class MyThirdDemoClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		try {
			System.out.println("Enter First No. : ");
			int number1=scanner.nextInt();
			System.out.println("Enter Second No. : ");
			int number2=scanner.nextInt();
			
			MyDivide myDivide=new MyDivide(number1, number2);
			
			myDivide.divide();
		}
		catch(Exception exception) {
			System.out.println("Something went wrong , please try again");
		}

		System.out.println("Good Bye from main");
	}

}
