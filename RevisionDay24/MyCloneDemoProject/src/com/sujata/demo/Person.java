package com.sujata.demo;

public class Person implements Cloneable{

	private int pId;
	private String pName;
	
	public Person() {
		
	}

	public Person(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}
	
	/*
	 * clone() method is from object class and is in protected scope
	 * so to make it accessible to other classes we are over riding it
	 * object class clone() : bit by bit copying(shallow cloning)
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException{
	return super.clone();	
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + "]";
	}
	
	
	
}
