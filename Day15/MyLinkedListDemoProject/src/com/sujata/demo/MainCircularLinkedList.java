package com.sujata.demo;

import java.util.Scanner;

public class MainCircularLinkedList {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		CircularLinkedListPresentation presentation=new CircularLinkedListPresentation();
		while(true) {
			presentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			presentation.performMenu(choice);
		}

	}

}
