package com.sujata.demo;

public class MyFourthDemo {

	public static void main(String[] args) {
		
		Thread t1=new Thread(()->System.out.println(Thread.currentThread().getName()+" is running"));
		t1.start();

	}

}
