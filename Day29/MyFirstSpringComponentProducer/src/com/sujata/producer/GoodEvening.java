package com.sujata.producer;

public class GoodEvening implements Greet {

	@Override
	public void wish(String name) {
		System.out.println("Good Evening "+name);

	}

}
