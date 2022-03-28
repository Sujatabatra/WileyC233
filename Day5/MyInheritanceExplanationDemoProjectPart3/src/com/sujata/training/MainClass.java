package com.sujata.training;

import com.sujata.demo.Grade;
import com.sujata.demo.Marks;
import com.sujata.demo.Sports;
import com.sujata.demo.Student;

public class MainClass {

	public static void main(String[] args) {
		
//		Grade grade=new Grade(111,"AAAA",89,90,67);
//		grade.display();
//		System.out.println("=========================");
//		Marks marks=new Marks(101, "BBBB", 67, 92, 56);
//		marks.display();

		/*
		 * syntactically : Base class reference Variable is type compatible with dervived class
		 * and the reverse is not true,
		 * i.e in base class Reference variable we can store the object of derived class
		 * 
		 * Dynamic Method Dispatch
		 */
		Student student;
		
		student=new Marks(111, "My Name", 89, 90, 78);
		student.display();
		student.dummy();
		student.show();
		
		System.out.println("========================");
		
		student=new Sports(121, "AAAA", "Cricket");
		student.display();
		System.out.println("=========================");
		
		student=new Grade(131, "BBBB", 90, 78, 65);
		student.display();
		
		
	}

}
