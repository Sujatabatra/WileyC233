package com.sujata.training;

import com.sujata.demo.Student;

public class MainClass {

	public static void main(String[] args) {
		Student student=new Student();
		student.setRollNo(101);
		student.setName("AAAA");
		student.displayStudent();
		
		System.out.println("==================");
		
		Marks marks=new Marks();
		marks.setRollNo(111);
		marks.setName("ABCD");
		marks.setMarks1(50);
		marks.setMarks2(90);
		marks.setMarks3(80);
		marks.displayStudentWithMarks();

	}

}
