package com.sujata.demo;

public class NonRoundedShapesCalculationMain {

	public static void main(String args[]) {
		NonRoundedShapesCalculation nonRoundedShapesCalculation = new NonRoundedShapesCalculation();

		NonRoundedShape nonRoundedShape;
		nonRoundedShape = new Rectangle(4, 8);

		nonRoundedShapesCalculation.setNonRoundedShape(nonRoundedShape);
		nonRoundedShapesCalculation.calculate();

		System.out.println("============");

		nonRoundedShape = new Square(5);

		nonRoundedShapesCalculation.setNonRoundedShape(nonRoundedShape);
		nonRoundedShapesCalculation.calculate();

		System.out.println("============");

		nonRoundedShape = new Cube(5);

		nonRoundedShapesCalculation.setNonRoundedShape(nonRoundedShape);
		nonRoundedShapesCalculation.calculate();
	}

}
