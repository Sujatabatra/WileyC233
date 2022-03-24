package com.sujata.proceduraldemo;

public class MyProceduralDemoClass {

	static int number,factorial;
	
	static void inputNumber(int n) {
		number=n;
	}
	
	static void calculateFactorial() {
		factorial=1;
		while(number>=1)
			factorial*=number--;
	}
	static void displayFactorial() {
		System.out.println("Factorial : "+factorial);
	}
	public static void main(String[] args) {
		inputNumber(4);
		//logical error
//		number=0;
		calculateFactorial();
		factorial=-89;
		displayFactorial();

	}

}
