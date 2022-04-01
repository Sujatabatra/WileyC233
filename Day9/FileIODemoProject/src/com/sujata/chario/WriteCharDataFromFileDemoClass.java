package com.sujata.chario;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCharDataFromFileDemoClass {

	public static void main(String[] args) {
		
		try(FileWriter fileWriter=new FileWriter("DemoCharIO");){
			String str="Sujata\nBatra\nDelhi";
			
			fileWriter.write(str);
			System.out.println("File Created");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
