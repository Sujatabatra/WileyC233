package com.sujata.training;

public class MainPalindromeCheck {

	public static void main(String[] args) {
		PalindromeCheck palindromeCheck=new PalindromeCheck();
		
		palindromeCheck.setNumber(123219);
		if(palindromeCheck.isPalindrome())
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not Palindrome");
	}

}
