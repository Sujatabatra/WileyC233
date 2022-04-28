package com.sujata.demo;

class Animal {

	public void sound() {
		System.out.println("Animal Sound");
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("Dog Sound");
	}
}

class Cat extends Animal{
	public void sound() {
		System.out.println("Cat Sound");
	}
}
