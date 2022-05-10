package com.sujata.producer;

public class Singer implements Performer {

	public Singer() {
		System.out.println("Hi I am Singer Constructor");
	}
	
	@Override
	public void perform() {
		System.out.println("Singer in singing LALALALA!!");

	}

}
