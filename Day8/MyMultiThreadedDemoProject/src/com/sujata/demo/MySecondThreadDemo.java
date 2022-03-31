package com.sujata.demo;

class MyFisrtThread extends Thread{
	
	/*
	 * run() is used to specify the job of the thread
	 */
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello from "+Thread.currentThread().getName()+" i : "+i);
		}
	}
}

class MySecondThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("Welcome Evereyone to "+Thread.currentThread().getName());
		display();
	}
	
	public void display() {
		System.out.println("Hi from "+Thread.currentThread().getName());
	}
}
public class MySecondThreadDemo {

	public static void main(String[] args) {
		
		MyFisrtThread myFisrtThread1=new MyFisrtThread(); //new norn state
		MySecondThread mySecondThread=new MySecondThread();
		MyFisrtThread myFisrtThread2=new MyFisrtThread();
		MyFisrtThread myFisrtThread3=new MyFisrtThread();
		
		
		
		myFisrtThread1.start();  //ready/running
		myFisrtThread2.start();
		myFisrtThread3.start();
		mySecondThread.start();
		
//		mySecondThread.display();
		
		for(int i=1;i<=5;i++) {
			System.out.println("Hello from "+Thread.currentThread().getName()+" i : "+i);
		}
		

	}

}
