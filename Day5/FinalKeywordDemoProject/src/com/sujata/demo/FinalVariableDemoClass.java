package com.sujata.demo;
/*
 * Final can be a variable, method or class
 * 1. If variable is final we can't change its value and it mandatory to initialize final variable at the time of declaration
 * 2. If a method is final we can't override that method
 * 3. If a class is final we can't extend that class
 */
class Demo{
	final int value=10;
	int number;
	
	public void change() {
//		value=5;
		System.out.println("Hi I am change method from Demo Class");
	}
	final public void show() {
		System.out.println("Hi I am show method from Demo Class");
	}
	
}

final class DemoChild extends Demo{
	
	@Override
	public void change() {
		System.out.println("Hi I am change method from Demo Class");
	}
	
//	@Override
//	public void show() {
//		System.out.println("Hi I am show method from Demo Class");
//	}
}

//class DemoGrandChild extends DemoChild{
//
//	public void demo() {
//		System.out.println("Hi I am demo() method from DemoGrandChild");
//	}
//	
//}

public class FinalVariableDemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
