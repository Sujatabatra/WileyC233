package com.sujata.producer;

import org.springframework.stereotype.Component;

@Component("ManiDeep")
public class Dancer implements Performer {

	@Override
	public void perform() {
		System.out.println("Dancer is dancing in Free Style");

	}

}
