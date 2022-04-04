package com.sujata.objectio;

import java.io.Serializable;

public class Student implements Serializable{

	private int rollNo;
	private String name;
	private int marks1;
	private int marks2;
	private int marks3;
	transient private double percentage;
	
	public Student() {
		
	}
	
	public Student(int rollNo, String name, int marks1, int marks2, int marks3) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	public Student(int rollNo, String name, int marks1, int marks2, int marks3, double percentage) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.percentage = percentage;
	}


	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	public double getPercentage() {
		setPercentage((marks1+marks2+marks3)/3);
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks1=" + marks1 + ", marks2=" + marks2
				+ ", marks3=" + marks3 + ", percentage=" + getPercentage() + "]";
	}
	
	
}
