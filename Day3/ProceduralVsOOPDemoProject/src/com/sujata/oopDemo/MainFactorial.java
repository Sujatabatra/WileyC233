package com.sujata.oopDemo;

public class MainFactorial {

	public static void main(String[] args) {
		Factorial factorial=new Factorial();
		factorial.setNumber(4);
//		factorial.number=0;
		System.out.println("Factorial : "+factorial.getFactorial());

	}

}
