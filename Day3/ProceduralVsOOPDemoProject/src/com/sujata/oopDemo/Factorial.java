package com.sujata.oopDemo;

public class Factorial {
	/*
	 * data to be readable or modifiable
	 * number : modifiable
	 * factorial : readable
	 * modifiable : setter method
	 * readable : getter method
	 */
	private int number,factorial;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getFactorial() {
		calculateFactorial();
		return factorial;
	}
	
	private void calculateFactorial() {
		factorial=1;
		while(number>=1)
			factorial*=number--;
	}
	

}
