package com.sujata.producer;

public class GoodMorning implements Greet {

	@Override
	public void wish(String name) {
		System.out.println("Good Morning "+name);

	}

}
