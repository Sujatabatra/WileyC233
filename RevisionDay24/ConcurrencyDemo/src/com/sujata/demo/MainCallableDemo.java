package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class MainCallableDemo {

	public static void main(String[] args) {
		
		List<Future<String>> futureList=new ArrayList<Future<String>>();
		
		List<CallableDemo> taskList=new ArrayList<CallableDemo>();
		taskList.add(new CallableDemo("first"));
		taskList.add(new CallableDemo("second"));
		taskList.add(new CallableDemo("third"));
		taskList.add(new CallableDemo("fourth"));
		taskList.add(new CallableDemo("fifth"));
		taskList.add(new CallableDemo("sixth"));
		taskList.add(new CallableDemo("seventh"));
		
		ExecutorService threadPool=Executors.newFixedThreadPool(4);
		
		for(CallableDemo task:taskList){
			futureList.add(threadPool.submit(task));
		}
		
		
		for(Future<String> future:futureList){
			try {
				System.out.println(future.get());   //blocked
//				System.out.println(future.get(1L,TimeUnit.SECONDS));
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
//			catch (TimeoutException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
		}
	}

}
