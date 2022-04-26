package com.sujata.demo;

import java.util.Comparator;
import java.util.TreeSet;

class Person{
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
	
}
public class MyFirstDemoClass {

	public static void main(String[] args) {
		
//		TreeSet<Person> personList=new TreeSet<Person>(new Comparator<Person>() {
//
//			@Override
//			public int compare(Person o1, Person o2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		});

		TreeSet<Person> personList=new TreeSet<Person>((o1,o2)-> {
				return 0;
			}
		);
	}

}
