package com.sujata.demo;

class MyFirstThreadClass extends Thread{
	
	public MyFirstThreadClass() {
		super();
	}
	
	public MyFirstThreadClass(String name) {
		super(name);
		
	}

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello from "+Thread.currentThread().getName()+" i : "+i);
		}
	}
}

class MySecondThreadClass extends Thread{
	
	@Override
	public void run() {
		System.out.println("Welcome Evereyone to "+Thread.currentThread().getName());
	}
	
	
}
public class MyFourthThreadDemo {

	public static void main(String[] args) {
		
		MyFirstThreadClass myFisrtThread1=new MyFirstThreadClass(); //new norn state
		MySecondThreadClass mySecondThread=new MySecondThreadClass();
//		mySecondThread.setName("SecondThread");
		MyFirstThreadClass myFisrtThread2=new MyFirstThreadClass("ThirdThread");
		MyFirstThreadClass myFisrtThread3=new MyFirstThreadClass();
		
		
		
		
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
