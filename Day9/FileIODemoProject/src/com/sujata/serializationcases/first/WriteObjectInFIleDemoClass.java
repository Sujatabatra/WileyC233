package com.sujata.serializationcases.first;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectInFIleDemoClass {

	public static void main(String[] args) {
//
//		FileOutputStream fileOutputStream=null;
//		ObjectOutputStream objectOutputStream=null;
		
		try(FileOutputStream fileOutputStream=new FileOutputStream("EmployeeData");
				ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);) {
//			fileOutputStream=new FileOutputStream("PersonData");
//			
//			objectOutputStream=new ObjectOutputStream(fileOutputStream);
			
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
//		finally {
//			try {
//				objectOutputStream.close();
//				fileOutputStream.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			
//		}

	}

}
