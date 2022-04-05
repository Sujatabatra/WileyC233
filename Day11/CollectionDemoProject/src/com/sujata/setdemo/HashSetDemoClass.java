package com.sujata.setdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemoClass {

	public static void main(String[] args) {
		/*
		 * HashSet is unique unordered auto growable and auto shrinkable collection of elements 
		 */
		Set<Integer> myCollection=new HashSet<>();
		
		System.out.println("Size of collection : "+myCollection.size());
		myCollection.add(10);
		myCollection.add(20);
		myCollection.add(15);
		myCollection.add(35);
		myCollection.add(50);
		myCollection.add(95);
		myCollection.add(15);
		myCollection.add(5);
		myCollection.add(10);
		System.out.println("Size of collection : "+myCollection.size());
		System.out.println(myCollection);

		myCollection.remove(20);
		System.out.println("Size of collection : "+myCollection.size());
		System.out.println(myCollection);
		
		System.out.println("Traversal using for each");
		for(Integer element:myCollection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using Iterator");
		Iterator<Integer> iterator=myCollection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
