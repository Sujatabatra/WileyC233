package com.sujata.demo;

import java.util.function.BinaryOperator;
import java.util.function.Function;

class Addition{
	public static int add(int number1,int number2) {
		return number1+number2;
	}
}
public class MyFirstClass {

	public static void main(String[] args) {
//		Function<String,Integer> function=(str)->Integer.parseInt(str);
		
		Function<String,Integer> function=Integer::parseInt;

//		BinaryOperator<Integer> binaryOperator=(n1,n2)->Addition.add(n1,n2);
		BinaryOperator<Integer> binaryOperator=Addition::add;
		
		System.out.println("Some of two nos : "+binaryOperator.apply(4, 12));
		
	}

}
