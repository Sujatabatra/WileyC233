package com.sujata.training;

/*
 * import all the static members of the class "ClassForStaticImport",
 * so that while calling the static members we need not to use class name
 */
import static com.sujata.demo.ClassForStaticImport.*;

import com.sujata.demo.ClassForStaticImport;

public class MainClassForStaticImport {

	public static void main(String[] args) {
		methodTwo();
		methodSeven();
		
		ClassForStaticImport obj=new ClassForStaticImport();

	}

}
