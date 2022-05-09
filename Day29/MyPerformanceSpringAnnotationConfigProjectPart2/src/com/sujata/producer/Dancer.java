package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ManiDeep")
public class Dancer implements Performer {

	private String danceStyle;
	
	@Value("Hip Hop")
	public void setDanceStyle(String danceStyle) {
		this.danceStyle = danceStyle;
	}


	@Override
	public void perform() {
		System.out.println("Dancer is dancing in "+danceStyle+" Style");

	}

}
