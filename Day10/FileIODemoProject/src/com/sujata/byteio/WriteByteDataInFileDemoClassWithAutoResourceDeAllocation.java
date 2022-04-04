package com.sujata.byteio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByteDataInFileDemoClassWithAutoResourceDeAllocation {

	public static void main(String[] args) {

		try (FileOutputStream fileOutputStream = new FileOutputStream("DemoByteIO");) {

			byte arr[] = { 'S', 'U', 'J', 'A', 'T', 'A', '\n', 'B', 'A', 'T', 'R', 'A' };

			fileOutputStream.write(arr);
			System.out.println("File Created ");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
