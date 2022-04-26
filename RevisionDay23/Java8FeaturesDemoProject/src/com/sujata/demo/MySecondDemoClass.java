package com.sujata.demo;

interface PopCorn{
	public void pop();
}

public class MySecondDemoClass {

	public static void buy(PopCorn popCorn) {
		System.out.println("Person is buying ");
		popCorn.pop();
	}
	public static void main(String[] args) {
		PopCorn butterPopCorn=new PopCorn() {
			@Override
			public void pop() {
				System.out.println("Butter PopCorn is Popping");
			}
		};
		
		butterPopCorn.pop();
		
		buy(new PopCorn() {
			@Override
			public void pop() {
				System.out.println("Salt and Pepper PopCorn is Popping");
			}
		});
		
//		datatype variablename=value;
//		int i=10;
//		functionalinterface variable=function(){}

		PopCorn cheesePopCorn=()->System.out.println("Cheese PopCorn is Popping");
		
		cheesePopCorn.pop();
		
		
	}

}
