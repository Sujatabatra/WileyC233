package com.sujata.demo;
/*
 * Constructors are used to initialize the Object at the time of declaration
 * Rules for Constructor
 * 1. Constructor Name must be same as that of class name
 * 2. Constructor can be parameterized of non parameterized
 * 3. Constructor cannot return any value not even void
 * 4. Constructor can be in any Scope ( i.e private, default and public)
 * 5. If class is constructor challenged ( that means have no constructor)then 
 * compiler will create one no argument constructor (default constructor) automatically and 
 * initialize all instance variables with default initial values,
 * which is ( 0 for byte, short, int, long 
 * 0.0 for float and double
 * \u0000  for character
 *  false for boolean
 *  null for objects)
 */
public class ComplexNumber {

	private int real,imagenary;

	/*
	 * this is the reference variable which holds the reference of current object
	 */
	/*
	 * Constructor Overloading
	 * (Polymorphism)multiple constructor ofcourse having same name , differentiated as per signature
	 * Signature means : Number and types of arguments and their sequence.
	 * 
	 */
	public ComplexNumber(int real, int imagenary) {
		this.real = real;
		this.imagenary = imagenary;
	}
	private ComplexNumber() {
		
	}
	
	ComplexNumber(int real) {
		super();
		this.real = real;
	}
	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImagenary() {
		return imagenary;
	}

	public void setImagenary(int imagenary) {
		this.imagenary = imagenary;
	}
	
	public void display() {
		System.out.print(real);
		if(imagenary>0) {
			System.out.println(" + "+imagenary+" i ");
		}
		else if(imagenary<0) {
			System.out.println(imagenary+" i ");
		}
	}
	
	public ComplexNumber sum(ComplexNumber complex2) {
		ComplexNumber sumComplex=new ComplexNumber();
		sumComplex.real=this.real+complex2.real;
		sumComplex.imagenary=this.imagenary+complex2.imagenary;
		return sumComplex;
	}
}
