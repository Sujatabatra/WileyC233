package com.sujata.serializationcases.second;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable{

	private int personId;
	private String personName;
	private int personAge;
	transient private Address personAddress;
	
	public Person() {
		
	}

	public Person(int personId, String personName, int personAge, Address personAddress) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
		this.personAddress = personAddress;
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

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public Address getPersonAddress() {
		return personAddress;
	}

	public void setPersonAddress(Address personAddress) {
		this.personAddress = personAddress;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge
				+ ", personAddress=" + personAddress + "]";
	}


	private void writeObject(ObjectOutputStream objectOutputStream)throws IOException,ClassNotFoundException{
		objectOutputStream.defaultWriteObject();
		objectOutputStream.writeObject(personAddress.getHouseNo());
		objectOutputStream.writeObject(personAddress.getStreet());
		objectOutputStream.writeObject(personAddress.getCity());
		objectOutputStream.writeObject(personAddress.getState());
		objectOutputStream.writeObject(personAddress.getPincode());
	}
	
	private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
		objectInputStream.defaultReadObject();
		personAddress=new Address((int)objectInputStream.readObject(),(String)objectInputStream.readObject(),(String)objectInputStream.readObject(),(String)objectInputStream.readObject(),(String)objectInputStream.readObject());
		
	}
}
