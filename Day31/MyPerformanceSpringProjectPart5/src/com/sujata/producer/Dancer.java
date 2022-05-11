package com.sujata.producer;

public class Dancer implements Performer {

	private String danceStyle;
	
	
	public void setDanceStyle(String danceStyle) {
		this.danceStyle = danceStyle;
	}


	@Override
	public void perform() {
		System.out.println("Dancer is dancing in "+danceStyle+" Style");

	}

}
