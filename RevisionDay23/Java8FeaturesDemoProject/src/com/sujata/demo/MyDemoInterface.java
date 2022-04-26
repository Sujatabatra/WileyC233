package com.sujata.demo;

@FunctionalInterface
public interface MyDemoInterface {

	public void methodOne();
	
	private void methodTwo() {
		System.out.println("Hello");
	}
}
