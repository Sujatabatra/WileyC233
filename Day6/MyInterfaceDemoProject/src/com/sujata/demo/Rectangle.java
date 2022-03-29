package com.sujata.demo;

public class Rectangle implements NonRoundedShape {

	private int length,breadth,area,perimeter;
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void area() {
		area=length*breadth;

	}

	@Override
	public void display() {
		System.out.println("Area of Rectangle : "+area);
		System.out.println("Perimeter of Rectangle : "+perimeter);

	}

	@Override
	public void perimeter() {
		perimeter=2*(length+breadth);

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
