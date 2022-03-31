package com.sujata.demo;

class DummyThread extends Thread{
	
	public void run() {
		for(int i=1;i<=5;i++)
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}
}
public class MySixthThreadDemo {

	public static void main(String[] args) {
		DummyThread dt=new DummyThread();
		
		dt.start();
//		dt.stop();
//		dt.start();

//		dt.run();
		try {
			dt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Going to join main");
		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for(int j=1;j<=5;j++)
			System.out.println(Thread.currentThread().getName()+" j : "+j);
	}

}
