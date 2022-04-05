package com.sujata.demo;

@FunctionalInterface
interface Shape {
	double area(double value);
}

public class MySecondDemo {

	public static void main(String[] args) {
//		Shape sqaure=new Shape() {
//			
//			@Override
//			public double area(double value) {
//				return value*value;
//			}
//		};
//
//		Shape sqaure =(double value)-> {
//				return value * value;
//			};
//		Shape sqaure = (value) -> {
//			return value * value;
//		};

//		Shape sqaure = value -> {
//			return value * value;
//		};
		
		Shape sqaure = value -> value * value;
		
		System.out.println("Area of Sqaure : " + sqaure.area(4));

	}

}
