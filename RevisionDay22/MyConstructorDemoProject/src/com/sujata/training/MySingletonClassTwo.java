package com.sujata.training;

public class MySingletonClassTwo {

	//Eager Initilization
	private static MySingletonClassTwo instance=new MySingletonClassTwo();
	
	private MySingletonClassTwo() {
		
	}
	
	public static MySingletonClassTwo getInstance() {
		return instance;
	}

	public void show() {
		System.out.println("Hi I am show method from MySingletonClass");
	}
}
