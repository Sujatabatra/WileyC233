package com.sujata.misc;

class IntegerInput{
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}

class StringInput{
	private String Value;

	public String getValue() {
		return Value;
	}

	public void setValue(String value) {
		Value = value;
	}
	
	
}

class DoubleInput{
	private double value;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	
}
class Person{
	private int personId;
	private String personName;
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
	
}
class AllTypesInput<T>{
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}

public class MyFirstGenericDemo {

	public static void main(String[] args) {
		AllTypesInput<Integer> ob1=new AllTypesInput<Integer>();
		ob1.setValue(10);
		
		AllTypesInput<String> ob2=new AllTypesInput<String>();
		ob2.setValue("Sujata");

		AllTypesInput<Person> ob3=new AllTypesInput<Person>();
		ob3.setValue(new Person(101, "AAAA"));
		
	}

}
