package com.sujata.demo;

class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("Hello from "+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Hello Again from "+Thread.currentThread().getName()+" after nice 2 second sleep");
	}
}
public class MyThirdThreadDemo {

	public static void main(String[] args) {
		MyThread myThread=new MyThread();

		myThread.start();
	}

}
