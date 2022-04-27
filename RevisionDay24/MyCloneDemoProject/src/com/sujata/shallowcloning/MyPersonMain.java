package com.sujata.shallowcloning;

public class MyPersonMain {

	public static void main(String[] args) {
		Person person=new Person(100, "Sujata", new Address(111, "Street", "City", "State", "Pincode"));
		
		
		Person replicaPerson=null;
		
		try {
			replicaPerson=person.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("============================");
		System.out.println("Person : "+person);
		System.out.println("Cloned Person : "+replicaPerson);
		
		person.setPersonId(999);
		replicaPerson.setPersonName("Kamal");
		System.out.println("==============================");
		
		System.out.println("Person : "+person);
		System.out.println("Cloned Person : "+replicaPerson);
		
		System.out.println("==============================");
		
		person.getAddress().sethNo(650);
		System.out.println();
		System.out.println("Person : "+person);
		System.out.println("Cloned Person : "+replicaPerson);
	}

}
