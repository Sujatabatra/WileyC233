package com.sujata.demo;

import java.util.Date;
import java.util.concurrent.Callable;

public class CallableDemo implements Callable<String> {

	private String name;
	
		
	public CallableDemo(String name) {
		super();
		this.name = name;
	}
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello "+name+" you are here at "+new Date();
	}

	

}
