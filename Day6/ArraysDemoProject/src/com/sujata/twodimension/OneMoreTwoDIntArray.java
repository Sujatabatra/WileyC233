package com.sujata.twodimension;

import java.util.Scanner;

public class OneMoreTwoDIntArray {

	public static void main(String[] args) {
		int arr[][];
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter No of Rows : ");
		int rows=scanner.nextInt();
		System.out.println("Enter No of Columns : ");
		int cols=scanner.nextInt();
		
		arr=new int[rows][cols];
		
		for(int row=0;row<rows;row++) {
			for(int col=0;col<cols;col++) {
				System.out.println("Enter value for row "+(row+1)+" and column "+(col+1)+" : ");
				arr[row][col]=scanner.nextInt();
			}
		}
		
		for(int row=0;row<rows;row++) {
			for(int col=0;col<cols;col++) {
				System.out.print(arr[row][col]+"      ");

			}
			System.out.println();
		}
		System.out.println("Traversal using for each loop");
		for(int ar[]:arr) {
			for(int element:ar) {
				System.out.print(element+" ");
			}
			System.out.println();
		}

	}

}
