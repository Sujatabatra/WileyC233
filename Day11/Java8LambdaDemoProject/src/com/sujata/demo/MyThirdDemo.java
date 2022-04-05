package com.sujata.demo;

import java.util.function.BiFunction;

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
		BiFunction<Integer, Integer, Integer> rect=(n1,n2)->n1*n2;
		System.out.println("Area of Rect : "+rect.apply(4, 5));
		System.out.println("Area of Rectangle : "+rectangle.someMethod(2, 8));

	}

}
