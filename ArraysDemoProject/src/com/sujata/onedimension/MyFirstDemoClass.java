package com.sujata.onedimension;

import java.util.Scanner;

public class MyFirstDemoClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int arr[];
		
		System.out.println("Enter total no of elements : ");
		int total=scanner.nextInt();
		
		arr=new int[total];
		
		for(int index=0;index<total;index++) {
			System.out.println("Enter "+(index+1)+" value : ");
			arr[index]=scanner.nextInt();
		}
		System.out.println("Traversal using Traditional for loop");
		for(int index=0;index<total;index++) {
			System.out.println(arr[index]);
		}
		
		System.out.println("Traversal using for each loop");
		for(int element:arr) {
			System.out.println(element);
		}
		
		

	}

}
