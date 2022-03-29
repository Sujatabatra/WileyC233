package com.sujata.demo;

public class Square extends InputNumber implements NonRoundedShape {

	private int area,perimeter;
	
	public Square(int number) {
		super(number);
	}

	@Override
	public void area() {
		area=getNumber()*getNumber();

	}

	@Override
	public void display() {
		System.out.println("Area of Sqaure : "+area);
		System.out.println("Perimeter of Sqaure : "+perimeter);

	}

	@Override
	public void perimeter() {
		perimeter=4*getNumber();

	}

	@Override
	public int getArea() {
		return area;
	}

	@Override
	public int getPerimeter() {
		return perimeter;
	}

}
