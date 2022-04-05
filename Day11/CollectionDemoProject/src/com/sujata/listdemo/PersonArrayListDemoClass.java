package com.sujata.listdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PersonArrayListDemoClass {

	public static void main(String[] args) {
		/*
		 * ArrayList is the ordered duplicate auto growable and auto shrinkable collection of elements
		 */
		List<Person> myList=new ArrayList<>();
		
		System.out.println("Size of Collection : "+myList.size());
		myList.add(new Person(1, "AAA", 34));
		myList.add(new Person(2, "BBB", 22));
		myList.add(new Person(3, "CCC", 12));
		myList.add(new Person(4, "DDD", 45));
		myList.add(new Person(5, "EEE", 30));
		myList.add(new Person(1, "AAA", 34));
		System.out.println("Size of Collection : "+myList.size());
		System.out.println(myList);
		
		myList.remove(2);
		System.out.println("Size of Collection : "+myList.size());
		System.out.println(myList);
		
		System.out.println("Traversal using Traditional For Loop!");
		for(int index=0;index<myList.size();index++) {
			System.out.println(myList.get(index));
		}
		
		System.out.println("Traversal using for each loop");
		for(Person element:myList) {
			System.out.println(element);
		}
		/*
		 * Factory design pattern is " instead of creating object with new and constructor(), we gave the responsibolity
		 * of creating the object to some other method
		 */
		System.out.println("Traversal using Iterator");
		Iterator<Person> iterator=myList.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Reverse Travelsa using ListIterator");
		ListIterator<Person> listIterator=myList.listIterator();
		while(listIterator.hasNext())
			listIterator.next();
		while(listIterator.hasPrevious())
			System.out.println(listIterator.previous());

	}

}
