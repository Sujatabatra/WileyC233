package com.sujata.serializationcases.second;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectInFIleDemoClass {

	public static void main(String[] args) {
//
//		FileOutputStream fileOutputStream=null;
//		ObjectOutputStream objectOutputStream=null;
		
		try(FileOutputStream fileOutputStream=new FileOutputStream("PersonData");
				ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);) {
//			fileOutputStream=new FileOutputStream("PersonData");
//			
//			objectOutputStream=new ObjectOutputStream(fileOutputStream);
			
			Person person=new Person(101, "AAAA", 34, new Address(222, "My Street", "Some City", "SOme State", "111111"));
			
			objectOutputStream.writeObject(person);
			
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
