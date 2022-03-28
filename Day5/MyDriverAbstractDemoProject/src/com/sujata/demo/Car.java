package com.sujata.demo;
/*
 * Abstract : is like sharing decision/contracts with child classes programmatically
 * Rule for abstract
 * 1. Abstract can be a class or method
 * 2. Abstract class cannot be instantiated( means , we can't create object but can create reference variable)
 * 3. Abstract method have only declaration , no method body not even blank method body
 * 4. If a class have even one abstract method then its mandatory to mark class also as abstract
 * 5. Child classes of abstract class must implement all the abstract method of Parents class,
 * otherwise child class also needs to mark itself as abstract and then no one will able to create object of child class as well
 * 
 */
abstract public class Car {

	private String color,model;

	public Car(String color, String model) {
		super();
		this.color = color;
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}
	
	abstract public void engine(); 
	
}
