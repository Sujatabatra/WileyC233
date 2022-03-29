package com.sujata.demo;

public interface NonRoundedShape extends Shape,Show {
	
	void perimeter();
	int getPerimeter();
	default void volume() {
		System.out.println("This Shape does not support Volume");
	}
	default int getVolume() {
		return 0;
	}
}
