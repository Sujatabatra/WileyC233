package com.sujata.demo;

public class DummyClass {

	/*
	 * Instance Variables : they will gte memory area on heap by constructor call
	 */
	private String name;
	private int age;
	
	public DummyClass() {
		
	}
	public DummyClass(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showDetails() {
		/*local Variable : memory area on stack (it will not be initialized by
		default initial value
		*/
//		int technology=10;
		Integer technology=Integer.valueOf(0);
		String x;
		x=new String();
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Technology : "+technology);
		System.out.println("x : "+x);
	}
	
	
	
}
