package com.sujata.demo;

class MyOuter{
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void dummy(){
		class Inner{
			public void dummyTry() {
				System.out.println("hello");
			}
		}
		class InnerA{
			public void dummyTry() {
				System.out.println("hello");
			}
		}
	}
	public void demo() {
		int var=0;
		//Method Local Inner class
		class MyInner{
			private int number;

			public int getNumber() {
				return number;
			}

			public void setNumber(int number) {
				this.number = number;
			}
			public void show() {
				System.out.println("var : "+var);
				System.out.println("number : "+number);
			}
		}
		MyInner myInner=new MyInner();
		System.out.println("number : "+myInner.number);
	}
	
}

public class MySecondDemo {
	public static void main(String args[]) {
		
	}

}
