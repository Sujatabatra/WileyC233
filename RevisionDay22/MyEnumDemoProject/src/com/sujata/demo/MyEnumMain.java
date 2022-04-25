package com.sujata.demo;

public class MyEnumMain {

	public static void main(String[] args) {
		Coffee coffee=Coffee.LATTE;
		
		System.out.println("Enjoy "+coffee.getSize()+" ounces of coffee by paying Rs. "+coffee.getPrice()+" which contains milk "+coffee.isMilk());

	}

}
