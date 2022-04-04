package com.sujata.serializationcases.three;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.sujata.serializationcases.second.Address;


public class Employee extends Person implements Serializable {

	private String department;
	private String designation;
	private int salary;
	
	public Employee(){
		
	}

	public Employee(int personId, String personName, String department, String designation, int salary) {
		super(personId,personName);
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}


	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	private void writeObject(ObjectOutputStream objectOutputStream)throws IOException,ClassNotFoundException{
		objectOutputStream.defaultWriteObject();
		objectOutputStream.writeObject(getPersonId());
		objectOutputStream.writeObject(getPersonName());
		
	}
	
	private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
		objectInputStream.defaultReadObject();
		setPersonId((int)objectInputStream.readObject());
		setPersonName((String)objectInputStream.readObject());
		
	}

	@Override
	public String toString() {
		return "Employee [department=" + department + ", designation=" + designation + ", salary=" + salary
				+ ", getPersonId()=" + getPersonId() + ", getPersonName()=" + getPersonName() + "]";
	}

	

	
	
}
