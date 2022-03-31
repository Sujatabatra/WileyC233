package com.sujata.demo;


class Base{
	public void show() {
		System.out.println("Hi I am Show method from Base "+Thread.currentThread().getName());
	}
}
//Job of a Thread
class Dervied extends Base implements Runnable{
	
	public void show() {
		super.show();
		System.out.println("Hello from show method of Derived too! "+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
	}

	@Override
	public void run() {
		show();
		
	}
}

public class MyFifthThreadDemo {

	public static void main(String args[]) {
		Dervied threadJob=new Dervied();
		
		Thread thread1=new Thread(threadJob,"FirstThread");
//		thread1.setName("FirstThread");
		Thread thread2=new Thread(threadJob,"FirstThread");
		
		thread1.start();
		thread2.start();
	}
}
