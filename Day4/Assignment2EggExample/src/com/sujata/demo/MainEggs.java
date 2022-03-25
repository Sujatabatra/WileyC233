package com.sujata.demo;

import java.util.Scanner;

public class MainEggs {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter total No of Eggs : ");
		int eggs=scanner.nextInt();
		
		Eggs eggsObject=new Eggs();
		eggsObject.setTotalNoOfEggs(eggs);
		
		EggUnit eggUnit=eggsObject.getConvertedEggs();
		
		System.out.println("Total No of Eggs in Gross : "+eggUnit.getGross()+" dozen : "+eggUnit.getDozen()+" remaining : "+eggUnit.getRemaining());
		

	}

}
