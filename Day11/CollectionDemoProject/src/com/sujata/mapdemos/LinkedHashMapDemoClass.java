package com.sujata.mapdemos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemoClass {

	public static void main(String[] args) {
		/*
		 * HashMap is the auto growable and auto shrinkable collection of key value, where keys are unique,
		 * values can be duplicated and ordered as per keys 
		 */
		Map<String, Integer> months=new LinkedHashMap<>();
		
		System.out.println("Size of months : "+months.size());
		months.put("Jan", 31);
		months.put("Feb", 28);
		months.put("Mar", 31);
		months.put("Apr", 30);
		months.put("May", 31);
		
		System.out.println("Size of months : "+months.size());
		
		System.out.println(months);
		months.put("Feb", 29);
		
		Set<String> monthNames=months.keySet();
		
		for(String monthName:monthNames) {
			System.out.println(monthName+" has "+months.get(monthName)+" days");
		}

	}

}
