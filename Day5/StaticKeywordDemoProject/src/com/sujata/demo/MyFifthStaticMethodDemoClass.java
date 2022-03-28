package com.sujata.demo;

/*
 * we cannot override static methods
 */
class Parent{
	public void methodOne() {
		System.out.println("Hi I am methodOne from Parent");
	}
	
	static public void methodTwo() {
		System.out.println("Hi I am methodTwo from Parent");
	}
	public void OneMoreMethod() {
		System.out.println("One More Method from Parent");
	}
}

class Child extends Parent{
	
	//overloading
	public void OneMoreMethod(String name) {
		System.out.println("One More Method from Parent"+name);
	}
	@Override
	public void methodOne() {
		System.out.println("Hi I am methodOne from Child");
	}
	
	public void someMethod() {
		System.out.println("some Method from Child");
	}

	public static void methodTwo() {
		System.out.println("Hi I am methodTwo from Child");
	}
}
public class MyFifthStaticMethodDemoClass {

	public static void main(String[] args) {
		Parent parent;
		
		parent=new Child();
		parent.methodOne();
		parent.methodTwo();

		Child.methodTwo();
//		parent.someMethod();
	}

}
