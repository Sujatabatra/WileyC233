package com.sujata.demo;

@FunctionalInterface
interface Demo{
	int someMethod(int number1,int number2);
}
public class MyThirdDemo {

	public static void main(String[] args) {
//		Demo rectangle=new Demo() {
//			@Override
//			public int someMethod(int number1, int number2) {
//				return number1*number2;
//			}
//		};
		
		Demo rectangle=(number1,number2)-> number1*number2;
			
		System.out.println("Area of Rectangle : "+rectangle.someMethod(2, 8));

	}

}
