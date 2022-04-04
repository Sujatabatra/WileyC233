package com.sujata.listdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemoClass {

	public static void main(String[] args) {
		/*
		 * ArrayList is the ordered duplicate auto growable and auto shrinkable collection of elements
		 */
		List<Integer> myList=new LinkedList<>();
		
		System.out.println("Size of Collection : "+myList.size());
		myList.add(10);
		myList.add(7);
		myList.add(20);
		myList.add(80);
		myList.add(56);
		myList.add(10);
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
		for(Integer element:myList) {
			System.out.println(element);
		}
		/*
		 * Factory design pattern is " instead of creating object with new and constructor(), we gave the responsibolity
		 * of creating the object to some other method
		 */
		System.out.println("Traversal using Iterator");
		Iterator<Integer> iterator=myList.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Reverse Travelsa using ListIterator");
		ListIterator<Integer> listIterator=myList.listIterator();
		while(listIterator.hasNext())
			listIterator.next();
		while(listIterator.hasPrevious())
			System.out.println(listIterator.previous());

	}

}
