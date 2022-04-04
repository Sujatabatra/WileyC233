package com.sujata.listdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FailtFastDemoClass {

	public static void main(String[] args) {
		/*
		 * ArrayList is the ordered duplicate auto growable and auto shrinkable collection of elements
		 */
		//Fail Fast 
		List<Integer> myList=new ArrayList<>();
		
		
		myList.add(10);
		myList.add(7);
		myList.add(20);
		myList.add(80);
		myList.add(56);
		myList.add(10);
		
		System.out.println("Traversal using Iterator");
		Iterator<Integer> iterator=myList.iterator();
		
		while(iterator.hasNext()) {
			int x=iterator.next();
			myList.add(x+5);
		}
		
		
	}

}
