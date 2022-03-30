package com.sujata.demo;

public class Person {

	private int age;

	public Person() {
	
	}
	public Person(int age)throws AgeCheckedException {
		super();
		if(age<18)
			throw new AgeCheckedException("Age can't be below 18");
		this.age = age;
	}

	public void setAge(int age) {
		if(age<18)
			throw new AgeUncheckedException("Age must be greater than 18");
		this.age = age;
	}


	public int getAge() {
		return age;
	}
	
	
	
}
