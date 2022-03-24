package com.sujata.training;

public class Table {

	private int number;

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void printTable() {
		com.sujata.demo.Product product=new com.sujata.demo.Product();
		product.setNumber1(number);
		for(int i=1;i<=10;i++) {
			product.setNumber2(i);
			System.out.println(number+" * "+i+" = "+product.getMultiplication());
			
		}
	}
}
