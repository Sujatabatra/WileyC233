package com.sujata.demo;

public class Cube extends InputNumber implements NonRoundedShape {

	private int area,perimeter,volume;
	
	public Cube(int number) {
		super(number);
	}

	@Override
	public void area() {
		area=6*getNumber()*getNumber();
	}

	@Override
	public int getArea() {
		return area;
	}

	@Override
	public void display() {
		System.out.println("Area of Cube : "+area);
		System.out.println("Perimeter of Cube : "+perimeter);
		System.out.println("Volume of Cube : "+volume);

	}

	@Override
	public void perimeter() {
		perimeter=12*getNumber();
	}

	@Override
	public int getPerimeter() {
		return perimeter;
	}
	
	@Override
	public void volume() {
		volume=getNumber()*getNumber()*getNumber();
	}
	
	@Override
	public int getVolume() {
		return volume;
	}

}
