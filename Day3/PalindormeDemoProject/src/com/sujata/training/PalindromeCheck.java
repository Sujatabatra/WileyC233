package com.sujata.training;

public class PalindromeCheck {

	private int number;
	private boolean palindrome;
	
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isPalindrome() {
		checkPalindorme();
		return palindrome;
	}
	
	private void checkPalindorme() {
		com.sujata.demo.ReverseNumber reverseNumber=new com.sujata.demo.ReverseNumber();
		reverseNumber.setNumber(number);
		if(number==reverseNumber.getReverse())
			palindrome=true;
		else
			palindrome=false;
		
	}
	
}
