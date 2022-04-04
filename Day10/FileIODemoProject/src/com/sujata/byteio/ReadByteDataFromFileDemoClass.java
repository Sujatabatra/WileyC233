package com.sujata.byteio;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadByteDataFromFileDemoClass {

	public static void main(String[] args) {
		
		try(FileInputStream fileInputStream=new FileInputStream("DemoByteIO");){
			int ch;
			while((ch=fileInputStream.read())!=-1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
