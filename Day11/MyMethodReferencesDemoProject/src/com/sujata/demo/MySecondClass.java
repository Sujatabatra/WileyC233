package com.sujata.demo;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

class Sum{
	public int add(int number1,int number2) {
		return number1+number2;
	}
}
public class MySecondClass {

	public static void main(String[] args) {
		
//		Consumer<String> consumer=(name)->System.out.println(name);
		
		Consumer<String> consumer=System.out::println;
		consumer.accept("Sujata");
		
		Sum sumObj=new Sum(); 
		
//		BinaryOperator<Integer> binaryOperator=(number1,number2)->sumObj.add(number1, number2);
		
		BinaryOperator<Integer> binaryOperator=sumObj::add;
		System.out.println("Sum of two nos : "+binaryOperator.apply(10, 20));
		
//		BinaryOperator<String> bOperator=(str1,str2)->str1.concat(str2);
		
		BinaryOperator<String> bOperator=String::concat;
		String fullname=bOperator.apply("Sujata", "Batra");
		System.out.println(fullname);
	
//		Function<String, Integer> function=(str)->str.length();
		Function<String, Integer> function=String::length;
		
		
	}

}
