package com.sujata.demo;
/*
 * Static can be a variable, method, block and import
 * 1. When Variable is static : that variable becomes class variable, that variable gets memory area at class loading time on stack,
 * we will able to access variables with ClassName.variableName provided their visibility is there.Also,
 * we can access static variable with objectName.variableName too again provided static variable visibility is there,
 * all objects of the class shares same copy of static variable.
 * 
 */

class DemoFirst{
	int value1;
	static int value2;
	
}
public class MyFirstStaticVariableDemoClass {
	static DemoFirst df;
	DemoFirst obj;
	void someMethod() {
		obj.value2=90;
	}
	public static void main(String args[]) {
//		DemoFirst.value2=10;
		
//		DemoFirst df;
		System.out.println(df);
		System.out.println(df.value2);  //valid
//		System.out.println(df.value1);   //NullPointerException
		
		DemoFirst df1=new DemoFirst();
		df1.value1=25;
		df1.value2=100;
		System.out.println("df1.value1 : "+df1.value1);
		System.out.println("df1.value2 : "+df1.value2);
		DemoFirst df2=new DemoFirst();
		df2.value1=20;
		System.out.println("df2.value1 : "+df2.value1);
		System.out.println("df2.value2 : "+df2.value2);
		
		System.out.println("DemoFirst.value2 : "+DemoFirst.value2);
		
		
	}

}
