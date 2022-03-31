package com.sujata.demo;


class Demo{
	
	public void show() {
		System.out.println("Hi I am show() method from Demo class and the thread executing me is "+Thread.currentThread().getName());
	}
}

public class MyFirstDemoClass {

	public static void main(String[] args) {
		System.out.println("Hello from Main");
		Demo dOb=new Demo();
		dOb.show();
		System.out.println("Good Bye from Thread "+Thread.currentThread().getName());

	}

}
