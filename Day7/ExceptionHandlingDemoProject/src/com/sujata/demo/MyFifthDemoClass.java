package com.sujata.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileOpen{
	
	String fileName;

	public FileOpen(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	public void openFileForRead() {
		try {
			FileInputStream fileInputStream=new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			System.out.println(fileName+"doesnot exist from function");
		}
	}
	
	public void oneMoreOpenFileForRead()throws FileNotFoundException {
			FileInputStream fileInputStream=new FileInputStream(fileName);
	}
	
}
public class MyFifthDemoClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String name=null;
		try {
			System.out.println("Enter File Name : ");
			name=scanner.next();
			
			FileOpen fileOpen=new FileOpen(name);
			fileOpen.openFileForRead();
			
			System.out.println("Enter one more File Name : ");
			name=scanner.next();
			FileOpen fileOpen2=new FileOpen(name);
			fileOpen2.oneMoreOpenFileForRead();
		}
		catch(FileNotFoundException fileNotFoundException) {
			System.out.println(name+" does not exist from main");
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}

}
