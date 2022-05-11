package com.sujata.producer;


public class GoodMorining implements Greet {

	private String name;

	public GoodMorining(String name) {
		super();
		this.name = name;
	}

	@Override
	public void wish() {
		System.out.println("Good Morning "+name);

	}

}
