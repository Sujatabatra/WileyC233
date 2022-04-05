package com.sujata.demo;

class MyOuterClass{
	
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public class MyInnerClass{
		private int number;

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}
		
		public void showFromMyInnerClass() {
			System.out.println("value : "+value);
			System.out.println("number : "+number);
		}
		
	}
	
	public void showFromMyOuterClass() {
		System.out.println("value : "+value);
		MyInnerClass myInnerClass=new MyInnerClass();
		System.out.println("number : "+myInnerClass.getNumber());
	}
}
public class MyFirstDemo {

	public static void main(String[] args) {
		MyOuterClass myOuterClass=new MyOuterClass();
		
		MyOuterClass.MyInnerClass myInnerClass=myOuterClass.new MyInnerClass();

	}

}
