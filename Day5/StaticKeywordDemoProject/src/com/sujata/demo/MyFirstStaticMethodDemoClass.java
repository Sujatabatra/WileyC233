package com.sujata.demo;
/*
 * Static can be a variable, method, block and import
 * 1. When Variable is static : that variable becomes class variable, that variable gets memory area at class loading time on stack,
 * we will able to access variables with ClassName.variableName provided their visibility is there.Also,
 * we can access static variable with objectName.variableName too again provided static variable visibility is there,
 * all objects of the class shares same copy of static variable.
 * 
 * 2. When method is static : we can call that method with ClassName.method() , provided static method visibility is there,
 * static method can access only static members of the class.
 * 
 */

class DemoSecond{
	private int value1;
	static private int value2;
	
	public int getValue1() {
		return value1;
	}
	public void setValue1(int value1) {
		this.value1 = value1;
	}
	
	public static int getValue2() {
		return value2;
	}
	public static void setValue2(int value2) {
		DemoSecond.value2 = value2;
	}
	public void showAll() {
		System.out.println("value 1: "+value1);
		System.out.println("value 2: "+value2);
	}
	
	public static void displayAll() {
//		System.out.println("value 1 : "+value1);
		System.out.println("value 2: "+value2);
	}
	
	
}
public class MyFirstStaticMethodDemoClass {
	
	public static void main(String args[]) {
		DemoSecond.setValue2(15);
		System.out.println("DemoSecond.value2 : "+DemoSecond.getValue2());
		
	}

}
