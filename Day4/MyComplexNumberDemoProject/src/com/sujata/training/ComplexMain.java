package com.sujata.training;

import com.sujata.demo.ComplexNumber;

public class ComplexMain {

	public static void main(String[] args) {
		/*
		 * ClassName objectName=new Constructor();
		 */
		ComplexNumber complexNumber1=new ComplexNumber(5,9);
//		complexNumber.setReal(5);
//		complexNumber.setImagenary(-9);
		System.out.print("First Complex No : ");
		complexNumber1.display();

//		ComplexNumber complexNumber2=new ComplexNumber(7);
//		System.out.println(complexNumber2.getReal()+" "+complexNumber2.getImagenary());
		
		ComplexNumber complexNumber2=new ComplexNumber(8, 5);
		System.out.print("First Complex No : ");
		complexNumber2.display();
		
		ComplexNumber sumComplexNumber=complexNumber1.sum(complexNumber2);
		System.out.print("Sum of two Complex No : ");
		sumComplexNumber.display();
	}

}
