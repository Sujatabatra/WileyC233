package com.sujata.deepcloning;

public class Person implements Cloneable{
	private int personId;
	private String personName;
	private Address address;
	
	public Person() {
		
	}

	public Person(int personId, String personName, Address address) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.address = address;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", address=" + address + "]";
	}

	@Override
	protected Person clone()throws CloneNotSupportedException{
		Person person= (Person)super.clone();
		person.address=person.address.clone();
		
		return person;
	}

}
