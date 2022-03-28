package com.sujata.demo;

public class MyThirdDemoClass {

	public void show() {
		System.out.println("SHOW");
	}
	
	static public void display() {
		System.out.println("DISPLAY");
	}
	public static void main(String[] args) {
		display();
		MyThirdDemoClass obj=new MyThirdDemoClass();
		obj.show();

	}

}
