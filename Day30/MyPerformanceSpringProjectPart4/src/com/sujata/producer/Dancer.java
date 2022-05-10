package com.sujata.producer;

public class Dancer implements Performer {

	
	public Dancer() {
		System.out.println("Hi I am Dance class Constructor");
	}
	@Override
	public void perform() {
		System.out.println("Dancer is dancing in Free Style");

	}

}
