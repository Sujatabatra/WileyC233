package com.sujata.demo;

public class MyVarArgDemoClass {

	public void display(int... args) {
		System.out.println("Total no of elements : "+args.length);
		for(int ele:args) {
			System.out.println(ele);
		}
	}
	
	public void display(String name,int... args) {
		System.out.println("Total no of elements : "+args.length);
		for(int ele:args) {
			System.out.println(ele);
		}
	}
	
	public void display(String name,int x,int... args) {
		System.out.println("Total no of elements : "+args.length);
		for(int ele:args) {
			System.out.println(ele);
		}
	}
	
	public void display(String name,double x) {
		
	}
	
	public static void main(String[] args) {
		MyVarArgDemoClass obj=new MyVarArgDemoClass();
		obj.display(10,20,30);
		System.out.println("=====================");
		obj.display(11,22,33,44,55,66);
		System.out.println("=================");
		obj.display();
		

	}

}
