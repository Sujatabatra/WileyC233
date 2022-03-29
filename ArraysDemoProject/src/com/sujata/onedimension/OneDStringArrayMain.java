package com.sujata.onedimension;

import java.util.Scanner;

public class OneDStringArrayMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Total No of Strings : ");
		int total=scanner.nextInt();
		
		OneDStringArray oneDStringArray=new OneDStringArray(total);
		
		for(int i=0;i<oneDStringArray.getTotalNoOfElements();i++) {
			System.out.println("Enter "+(i+1)+" String ");
			String str=scanner.next();
			oneDStringArray.setElementAtLocation(str, i);
		}
		
		for(String str:oneDStringArray.getArr()) {
			System.out.println(str);
		}

	}

}
