package com.sujata.anonymousinnerclass;

public class MainFoodCourt {

	public static void main(String[] args) {
		FoodCourt foodCourt=new FoodCourt();
		
		
		PopCorn popCorn=new CaramelPopCorn();
		
		foodCourt.buyPopCorn(popCorn);

		popCorn=new PopCorn() {
			@Override
			public void pop() {
				System.out.println("Butterly PopCorn Poping!");
			}
		};
		
		foodCourt.buyPopCorn(popCorn);
		
		
		foodCourt.buyPopCorn(new PopCorn() {
			@Override
			public void pop() {
				System.out.println("Hot Cheesy PopCorn Popping");
			}
			
			@Override
			public void show() {
				System.out.println("Demonstrating overring multiple methods in anonymous inner class");
			}
		});
	}

}
