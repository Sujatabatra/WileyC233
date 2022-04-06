package com.sujata.demo;

import java.util.Arrays;
import java.util.List;

public class MyFirstClass {

	public static void main(String[] args) {
		List<Integer> myList=Arrays.asList(10,20,33,40,57,65,70);
		
//		myList.stream().forEach(element->System.out.println(element));
		
		myList.stream().forEach(System.out::println);

		System.out.println("===============");
		myList.stream().
		filter(element->element%2==0)
		.forEach(System.out::println);
		
		long total=myList.stream().
				filter(element->element%2==0)
				.count();
		
		System.out.println("Total No of even Elements in a list : "+total);
	}

}
