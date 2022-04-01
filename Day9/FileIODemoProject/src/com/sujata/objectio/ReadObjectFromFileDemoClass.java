package com.sujata.objectio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectFromFileDemoClass {

	public static void main(String[] args) {
		
		try(FileInputStream fileInputStream=new FileInputStream("PersonData");
				ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
				){
			
			Person person=(Person)objectInputStream.readObject();
			
			System.out.println("Person Details : "+person.getPersonId()+"  "+person.getPersonName());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
