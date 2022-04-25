package com.sujata.demo;

enum Size{
	REGULAR(5),LARGE(10),OVERWHELMING(25);
	
	
	private Size(int ounce) {
		this.ounce = ounce;
	}

	public int getOunce() {
		return ounce;
	}

	private int ounce;
}
public enum Coffee {

	LATTE(Size.OVERWHELMING,56.7,true),AMERICANO(Size.LARGE,100,false),JAVA(Size.LARGE,75.6,true);
	
	private Coffee(Size size, double price, boolean milk) {
		this.size = size;
		this.price = price;
		this.milk = milk;
	}
	private Size size;
	private double price;
	private boolean milk;
	public Size getSize() {
		return size;
	}
	public double getPrice() {
		return price;
	}
	public boolean isMilk() {
		return milk;
	}
	
	
}
