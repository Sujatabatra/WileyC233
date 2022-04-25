package com.sujata.training;

public class MySingletonClass {

	private static MySingletonClass instance;
	
	private MySingletonClass() {
		
	}
	//with first call to getInstance we get the object in the memory (Lazy Initialization)
	public static MySingletonClass getInstance() {
		if(instance==null)
			instance=new MySingletonClass();
		return instance;
	}

	public void show() {
		System.out.println("Hi I am show method from MySingletonClass");
	}
}
