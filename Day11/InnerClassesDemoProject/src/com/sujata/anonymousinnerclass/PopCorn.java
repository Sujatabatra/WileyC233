package com.sujata.anonymousinnerclass;

public interface PopCorn {

	public void pop();
	default void show() {
		System.out.println("Some dummy method");
	}
}
