package com.sujata.demo;

import java.util.Scanner;

public class MyFirstDemoClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int location = 0;
		int number1 = 0;
		int number2 = 0;
		int result = 0;
		try {
			System.out.println("Enter First No : ");
			number1 = scanner.nextInt();
			System.out.println("Enter Second No : ");
			number2 = scanner.nextInt();

			result = number1 / number2;

			System.out.println("Result of Division : " + result);

			int arr[];
			System.out.println("Enter Total no of elements : ");
			int total = scanner.nextInt();
			arr = new int[total];

			for (int index = 0; index < total; index++) {
				System.out.println("Enter " + (index + 1) + " element : ");
				arr[index] = scanner.nextInt();
			}

			System.out.println("Enter Array Locations whoes value you want to view : ");
			location = scanner.nextInt();

			System.out.println("Value at location " + location + " in an array : " + arr[location]);

		} catch (ArithmeticException arithmeticException) {
			System.out.println(
					"Diving no by zero is undefined, do you want to enter any other no,(y for yes and n for no)");
			String choice = scanner.next();
			if (choice.equals("y")) {
				System.out.println("Enter Second No again : ");
				number2 = scanner.nextInt();
			}
			try {
				result = number1 / number2;
				System.out.println("Result of Division : " + result);
			} catch (ArithmeticException arithmeticException2) {
				System.out.println("Undefined");
			}
		} catch (NegativeArraySizeException negativeArraySizeException) {
			System.out.println("Array Size can only be positive integer, please try again!");
		} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			System.out.println("Location " + location + " does not exist in an array!");
		} catch (Exception exception) {
			System.out.println("Something went wrong, please try after sometime");
		}

		System.out.println("Good Bye from main!");

	}

}
