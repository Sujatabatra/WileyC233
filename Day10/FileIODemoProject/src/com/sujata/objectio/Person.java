package com.sujata.objectio;

import java.io.Serializable;

public class Person implements Serializable{

	
	private static final long serialVersionUID = 8690758045384365723L;
	
	private int personId;
	private String personName;
	private int age;
	
	public Person() {
		
	}
	public Person(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
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
