package com.sujata.demo;

public class MyBase {

	private String name;

	private MyBase() {
		
	}
	public MyBase(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
