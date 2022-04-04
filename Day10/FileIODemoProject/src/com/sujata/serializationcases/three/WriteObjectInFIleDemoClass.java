package com.sujata.serializationcases.three;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectInFIleDemoClass {

	public static void main(String[] args) {

		
		try(FileOutputStream fileOutputStream=new FileOutputStream("EmployeeData");
				ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);) {
			
			Employee employee=new Employee(111, "AAAA", "Sales", "Executive", 34567);
			
			objectOutputStream.writeObject(employee);
			
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
