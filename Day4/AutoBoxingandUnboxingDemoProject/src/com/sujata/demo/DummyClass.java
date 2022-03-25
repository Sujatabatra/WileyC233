package com.sujata.demo;

public class DummyClass {

	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);

		int x = i1.intValue();
		int z = i2.intValue();
		int s = x + z;

		Integer i3 = Integer.valueOf(s);

		Integer i4 = i1 + i2;
	}

}
