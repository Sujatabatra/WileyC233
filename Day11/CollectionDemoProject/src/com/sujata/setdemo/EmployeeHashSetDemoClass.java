package com.sujata.setdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EmployeeHashSetDemoClass {

	public static void main(String[] args) {
		/*
		 * HashSet is unique unordered auto growable and auto shrinkable collection of elements 
		 */
		Set<Employee> myCollection=new HashSet<>();
		
		System.out.println("Size of collection : "+myCollection.size());
		myCollection.add(new Employee(1, "AAA", "Sales", "Associate", 56789));
		myCollection.add(new Employee(2, "BBB", "HR", "Sr. Associate", 67890));
		myCollection.add(new Employee(3, "CCC", "IT", "Associate", 78943));
		myCollection.add(new Employee(4, "DDD", "HR", "Manager", 89000));
		myCollection.add(new Employee(1, "AAA", "Sales", "Associate", 34678));
		
		System.out.println("Size of collection : "+myCollection.size());
		System.out.println(myCollection);

		
		System.out.println("Traversal using for each");
		for(Employee element:myCollection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using Iterator");
		Iterator<Employee> iterator=myCollection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
