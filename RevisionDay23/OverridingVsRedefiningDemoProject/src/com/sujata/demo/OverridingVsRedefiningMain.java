package com.sujata.demo;

class MyBase{
	
	public void show() {
		System.out.println("Hi I am show Method of MyBase");
	}
	
	static public void display() {
		System.out.println("Hi I am static display method of MyBase");
	}
}

class MyDerived extends MyBase{
	@Override
	public void show() {
		super.show();
		System.out.println("Hi I am show method of MyDerived");
	}
	
	static public void display() {
		System.out.println("Hi I am display method of MyDerived");
	}
}
public class OverridingVsRedefiningMain {

	public static void main(String[] args) {
		//Reference Variable is of base class
		MyBase myBase;
		
		myBase=new MyBase();
		myBase.show();
		myBase.display();
		MyBase.display();
		
		System.out.println("===============================");
		myBase=new MyDerived();
		myBase.show();
		myBase.display();
		MyDerived.display();

	}

}
