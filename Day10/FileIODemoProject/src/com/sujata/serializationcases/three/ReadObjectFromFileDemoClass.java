package com.sujata.serializationcases.three;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectFromFileDemoClass {

	public static void main(String[] args) {
		
		try(FileInputStream fileInputStream=new FileInputStream("EmployeeData");
				ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
				){
			
			Employee employee=(Employee)objectInputStream.readObject();
			
			
			
			System.out.println("Employee : "+employee);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
