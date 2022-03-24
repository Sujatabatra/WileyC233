package com.sujata.demo;

public class ReverseNumber {

	private int number,reverse;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getReverse() {
		calculateReverse();
		return reverse;
	}
	
	private void calculateReverse() {
		int remainder=0;
		while(number!=0) {
			remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
	}
	
}
