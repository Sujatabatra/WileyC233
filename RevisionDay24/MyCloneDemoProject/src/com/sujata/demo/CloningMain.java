package com.sujata.demo;

public class CloningMain {

	public static void main(String[] args) {
		Person person=new Person(100, "Sujata");
		
		person.setpName(person.getpName().concat(" Batra"));
		
		System.out.println("Person : "+person);
		Person clonedPerson=null;
		try {
			clonedPerson=(Person)person.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Cloned Person "+clonedPerson);
		clonedPerson.setpId(200);
		System.out.println("=======================");
		System.out.println("Person "+person);
		System.out.println("cloned Person"+clonedPerson);
		
	}

}
