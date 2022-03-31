package com.sujata.demo;


class Demo{
	
	public void show() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello from "+Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Hi I am show() method from Demo class and the thread executing me is "+Thread.currentThread().getName());
	}
}

public class MyFirstDemoClass {

	public static void main(String[] args) {
		System.out.println("Hello from Main");
		Demo dOb=new Demo();
		dOb.show();
		
		for(int j=1;j<=5;j++) {
			System.out.println("Hello from "+Thread.currentThread().getName()+" j : "+j);
		}
		
		System.out.println("Good Bye from Thread "+Thread.currentThread().getName());

		
	}

}
