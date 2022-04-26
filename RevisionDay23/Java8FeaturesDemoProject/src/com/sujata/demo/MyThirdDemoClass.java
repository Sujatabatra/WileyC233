package com.sujata.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyThirdDemoClass {

	public static void main(String[] args) {
		List<Integer> collection=Arrays.asList(10,20,30,43,56,78);
		
		Stream<Integer> stream=collection.stream();
		
		long total=stream.count();
		System.out.println(total);
		
		collection.stream().forEach((element)->System.out.println(element));
		System.out.println("====================");
		collection.stream()
		.filter(element->element%5==0)
		.map(value->value*2)
		.forEach(System.out::println);

		System.out.println("================");
		
		List<Integer> list=collection.stream()
		.filter(element->element%5==0)
		.map(value->value*2)
		.collect(Collectors.toList());
	}

}
