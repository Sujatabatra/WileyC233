package com.sujata.demo;

public class MyReflectionDemo {

	private String str;
	
	public MyReflectionDemo() {
		str="Sujata Batra";
	}
	
	public void show() {
		System.out.println("str : "+str);
	}
	
	public void display(int number) {
		System.out.println("Hi I am display() method of MyReflectionDemo ,number : "+number);
	}
	
	private void method() {
		System.out.println("Hi I am private method");
	}
	
}
