package com.sujata.demo;

class DemoThread extends Thread{
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+" running it ");
	}
}
public class MySeventhDemoProject {

	public static void main(String[] args) {
		DemoThread thread1=new DemoThread();
		thread1.start();
		
		thread1.run();

	}

}
