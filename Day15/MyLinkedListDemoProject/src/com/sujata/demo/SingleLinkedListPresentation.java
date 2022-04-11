package com.sujata.demo;

import java.util.Scanner;

public class SingleLinkedListPresentation {

	private SingleLinkedList singleLinkedList=new SingleLinkedList();
	
	public void showMenu() {
		System.out.println("1. Insert Element in a List");
		System.out.println("2. Traverse List");
		System.out.println("3. Delete Element ");
		System.out.println("4. Exit");
	}
	
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		int element=0;
		switch(choice) {
		case 1:
			System.out.println("Enter Element : ");
			element=scanner.nextInt();
			if(singleLinkedList.insert(element))
				System.out.println("Data Inserted Successful");
			else
				System.out.println("Data Insertion Failed");
			break;
		case 2:
			singleLinkedList.traverse();
			break;
		case 3:
			System.out.println("Enter Element : ");
			element=scanner.nextInt();
			if(singleLinkedList.delete(element))
				System.out.println("Data Deleted Successful");
			else
				System.out.println("Data Deletion Failed");
			break;
		case 4:
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		
		}
	}
}
