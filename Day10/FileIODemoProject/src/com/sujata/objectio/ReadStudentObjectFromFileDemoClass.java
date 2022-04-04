package com.sujata.objectio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadStudentObjectFromFileDemoClass {

	public static void main(String[] args) {
		
		try(FileInputStream fileInputStream=new FileInputStream("StudentData");
				ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
				){
			
			Student student=(Student)objectInputStream.readObject();
			
			
			System.out.println(student);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
