package com.sujata.demo;

/*
 * static block will get executed only once during class loading time
 * instance block will execute everytime before constructor call
 */
class Dummy{
	
	static {
		System.out.println("10 : Hi I am static block from Dummy Class");
	}
	
	{
		System.out.println("14 : Hi I am instance block from Dummy Class");
	}
	
	public Dummy() {
		System.out.println("18 : Hi I am Dummy class Default Constructor");
	}
}
class DummyChild extends Dummy{
	
	static {
		System.out.println("24 : Hi I am static block from DummyChild Class");
	}
	
	{
		System.out.println("28 : Hi I am instance block from DummyChild Class");
	}
	
	public DummyChild() {
		//implicit call to base class default constructor happend (super())
		System.out.println("33 : Hi I am DummyChild class Default Constructor");
	}
}
public class MyFourthStaticBlockDemoClass {

	public static void main(String[] args) {
		
		Dummy dummy=new Dummy();
		
		
		// 24,14,18,28,33
		DummyChild obj1=new DummyChild();
		
	
	}

}
