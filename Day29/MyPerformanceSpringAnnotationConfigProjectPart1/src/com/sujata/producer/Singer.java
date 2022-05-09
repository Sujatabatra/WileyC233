package com.sujata.producer;

import org.springframework.stereotype.Component;

@Component("Harshit")
public class Singer implements Performer {

	@Override
	public void perform() {
		System.out.println("Singer in singing LALALALA!!");

	}

}
