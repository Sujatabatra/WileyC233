package com.sujata.demo;

public class NonRoundedShapesCalculation {

	public static void main(String args[]) {
		NonRoundedShape nonRoundedShape;
		
		nonRoundedShape=new Rectangle(4, 8);
		
		nonRoundedShape.area();
		nonRoundedShape.perimeter();
		nonRoundedShape.display();
		
		System.out.println("============");
		
		nonRoundedShape=new Square(5);
		
		nonRoundedShape.area();
		nonRoundedShape.perimeter();
		nonRoundedShape.display();
	}
	
}
