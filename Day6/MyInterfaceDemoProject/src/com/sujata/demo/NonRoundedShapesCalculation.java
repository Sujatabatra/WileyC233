package com.sujata.demo;

public class NonRoundedShapesCalculation {

	private NonRoundedShape nonRoundedShape;

	public void setNonRoundedShape(NonRoundedShape nonRoundedShape) {
		this.nonRoundedShape = nonRoundedShape;
	}

	public void calculate() {
		nonRoundedShape.area();
		nonRoundedShape.perimeter();
		nonRoundedShape.volume();
		nonRoundedShape.display();
	}

}
