package com.sujata.listdemo;

public class Person {

	private int personId;
	private String personName;
	private int age;
	
	public Person() {
		
	}

	public Person(int personId, String personName, int age) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.age = age;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", age=" + age + "]";
	}
	
}
