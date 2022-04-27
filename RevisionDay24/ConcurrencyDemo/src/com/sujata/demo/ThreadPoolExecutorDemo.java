package com.sujata.demo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutorDemo {

	public static void main(String[] args) {
		
//		Executor fixedThreadPool=Executors.newFixedThreadPool(4);
		ExecutorService fixedThreadPool=Executors.newFixedThreadPool(4);
		for(int i=1;i<=20;i++){
			HelloTask task=new HelloTask("Task"+i);
			fixedThreadPool.execute(task);
		}
		fixedThreadPool.shutdown();
		fixedThreadPool.execute(new HelloTask("new task"));
	}

}

//Thread Job
class HelloTask implements Runnable{

	private String name;
	
	public HelloTask(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for(int k=1;k<=5;k++){
		System.out.println("I am Hello task : "+this.name+"executed by :"+
	Thread.currentThread().getName()+" : "+k);
		}
		
	}
	
}
