package com.sujata.byteio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByteDataInFileDemoClass {

	public static void main(String[] args) {
		FileOutputStream fileOutputStream=null;
		try {
			fileOutputStream=new FileOutputStream("DemoByteIO");
			
			byte arr[]= {'S','U','J','A','T','A','\n','B','A','T','R','A'};
			
			fileOutputStream.write(arr);
			System.out.println("File Created ");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
