package com.sujata.demo;

import java.util.function.DoubleUnaryOperator;

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

		DoubleUnaryOperator circle=value->3.142*value*value;
		System.out.println("Area of Circle : "+circle.applyAsDouble(5));
		
	}

}
