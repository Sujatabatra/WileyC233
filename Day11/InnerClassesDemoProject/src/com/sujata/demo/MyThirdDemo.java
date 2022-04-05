package com.sujata.demo;

import com.sujata.demo.DemoOuter.DemoInner;

class DemoOuter{
	
	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	//static inner class : Nested Inner classes
	static class DemoInner{
		private int value;

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
		
	}
	
}
public class MyThirdDemo {

	public static void main(String[] args) {
		DemoOuter.DemoInner demoInner=new DemoOuter.DemoInner();

	}

}
