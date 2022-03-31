package com.sujata.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class ThreadJob implements Runnable {

	private int counter;

	public ThreadJob(int counter) {
		super();
		this.counter = counter;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " counter " + counter);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " woke up for counter " + counter);

	}

}

public class MyFirstClass {

	public static void main(String[] args) {
		Executor threadPool=Executors.newFixedThreadPool(4);
		
		for(int jobId=1;jobId<=20;jobId++) {
			threadPool.execute(new ThreadJob(jobId));
		}

	}

}
