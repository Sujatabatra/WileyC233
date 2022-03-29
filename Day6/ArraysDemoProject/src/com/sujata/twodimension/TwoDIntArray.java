package com.sujata.twodimension;

import java.util.Scanner;

public class TwoDIntArray {
	
	public static void main(String args[]) {
		
		Scanner scanner=new Scanner(System.in);
		
		int arr[][];
		
		System.out.println("Enter No of Rows : ");
		int rows=scanner.nextInt();
		
		arr=new int[rows][];
		
		for(int row=0;row<rows;row++) {
			System.out.println("Enter No of Columns for "+(row+1)+" row :");
			int cols=scanner.nextInt();
			arr[row]=new int[cols];
			for(int col=0;col<cols;col++) {
				System.out.println("Enter value for row "+(row+1)+" and column "+(col+1)+" : ");
				arr[row][col]=scanner.nextInt();
			}
		}
		
	
	}

}
