package com.sujata.demo;



public class Marks extends Student {

	private int marks1,marks2,marks3;
	
//	public Marks() {
//		/*implicit call for base class default constructor(0 argument constructor)
//		 * Question : what if base don't have default constructor
//		 * Ans : Give explicit call to argumented constuctor , by super() keyword
//		 */
//		super(0,null);
//		System.out.println("Hi I am default constructor in Marks");
//	}

	public Marks(int rollNo, String name, int marks1, int marks2, int marks3) {
		super(rollNo, name);
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
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
	
	public void displayStudentWithMarks() {
		displayStudent();
		System.out.println("Marks1 : "+marks1);
		System.out.println("Marks2 : "+marks2);
		System.out.println("Marks3 : "+marks3);
		
	}
}
