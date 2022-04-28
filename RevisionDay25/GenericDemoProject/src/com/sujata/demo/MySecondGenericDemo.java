package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;

class GenericClass<T>{
//	static T m;
	
}
public class MySecondGenericDemo {

	public static void main(String[] args) {
//		List<Number> list=new ArrayList<Integer>();
		
		List<Number> list=new ArrayList<Number>();

		list.add(new Integer(8));
		list.add(new Double(78.9));
		
	}

}
