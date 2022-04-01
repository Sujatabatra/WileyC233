package com.sujata.serializationcases.first;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * if base class is serialized then derived class will also be serialized by default,
 * if you don't want to allow derived class obeject to be serialized,
 * then write readObject() and writeObject() and throw NotSerializableException
 */
public class Employee extends Person {

	private String department;
	private String designation;
	private int salary;
	
	public Employee(){
		
	}

	public Employee(int personId, String personName, String department, String designation, int salary) {
		super(personId, personName);
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
	
	private void writeObject(ObjectOutputStream objectOutputStream)throws NotSerializableException {
		throw new NotSerializableException();
	}
	
	private void readObject(ObjectInputStream objectInputStream)throws NotSerializableException{
		throw new NotSerializableException();
	}
	
}
