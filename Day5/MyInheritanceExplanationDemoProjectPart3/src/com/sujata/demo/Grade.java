package com.sujata.demo;

public class Grade extends Marks {

	private double percentage;
	private String grade;
	
	
	
	public Grade(int rollNo, String name, int marks1, int marks2, int marks3) {
		super(rollNo, name, marks1, marks2, marks3);
		
	}
//	public Grade() {
//		//implicit call for base class default constructor(0 argument constructor)
//		System.out.println("Hi I am default Constructor in grade");
//	}
	
	public double getPercentage() {
		percentage=(getMarks1()+getMarks2()+getMarks3())/3;
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getGrade() {
		if(getPercentage()>75)
			grade="A Grade";
		else
			grade="B Grade";
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public void display() {
		
		super.display();
		System.out.println("Percentage : "+getPercentage());
		System.out.println("Grade : "+getGrade());
	}
	
}
