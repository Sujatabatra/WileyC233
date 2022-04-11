package com.sujata.demo;

import java.util.Scanner;

public class MainSingleLinkedList {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		SingleLinkedListPresentation presentation=new SingleLinkedListPresentation();
		while(true) {
			presentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			presentation.performMenu(choice);
		}

	}

}
