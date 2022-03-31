package com.sujata.training;

public class AccountMain {

	public static void main(String[] args) {
		Account a001=new Account();
//		Account a002=new Account();
		
		Thread pranav=new Thread(a001, "Pranav");
		Thread himanshu=new Thread(a001,"Himanshu");
		
		pranav.start();
		himanshu.start();

	}

}
