package com.sujata.producer;

public class Juggler implements Performer {

	public Juggler() {
		System.out.println("Hi I am Juggler Constructor");
	}
	@Override
	public void perform() {
		System.out.println("Juggler is juggling 5 balls");

	}

}
