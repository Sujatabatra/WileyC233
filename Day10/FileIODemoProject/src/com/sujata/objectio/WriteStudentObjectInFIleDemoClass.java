package com.sujata.objectio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteStudentObjectInFIleDemoClass {

	public static void main(String[] args) {

		
		try(FileOutputStream fileOutputStream=new FileOutputStream("StudentData");
				ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);) {
			
			Student student=new Student(101, "AAAA", 67, 89, 95);
			
			objectOutputStream.writeObject(student);
			
			System.out.println("File Created!");
		}
		catch(FileNotFoundException fileNotFoundException) {
			fileNotFoundException.printStackTrace();
		}
		catch (IOException ioException) {
			ioException.printStackTrace();
		}

	}

}
