package com.sujata.sort;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyBookTreeSetDemoClass {

	public static void main(String[] args) {
		/*
		 * TreeSet is unique ordered auto growable and auto shrinkable collection of elements 
		 */
		Set<MyBook> myCollection=new TreeSet<>(new MyBookAuthorNameSort());
		
		System.out.println("Size of collection : "+myCollection.size());
		myCollection.add(new MyBook(101, "Book 1", "Mr. A", 1500, 3200));
		myCollection.add(new MyBook(102, "Book 2", "Mr. B", 1000, 1200));
		myCollection.add(new MyBook(103, "Book 3", "Mr. B", 500, 1800));
		myCollection.add(new MyBook(104, "Book 4", "Mr. C", 1000, 1600));
		myCollection.add(new MyBook(101, "Book 1", "Mr. A", 1500, 3200));
		
		System.out.println("Size of collection : "+myCollection.size());
		System.out.println(myCollection);

				
		System.out.println("Traversal using for each");
		for(MyBook element:myCollection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using Iterator");
		Iterator<MyBook> iterator=myCollection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
