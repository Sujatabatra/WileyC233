package com.sujata.demo;

public class SportsCar /*extends Car*/ {

	private Car car;

	public SportsCar(Car car) {
		this.car = car;
	}
	
	public void sportsEngine() {
		System.out.println("Sports Car "+car.getModel());
		car.engine();
	}

	
	public void engine() {
		car.engine();
		
	}
	
}
