package com.sujata.setdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemoClass {

	public static void main(String[] args) {
		/*
		 * LinkedHashSet is unique ordered auto growable and auto shrinkable collection of elements 
		 */
		Set<Integer> myCollection=new TreeSet<>();
		
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
