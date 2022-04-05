package com.sujata.demo;


@FunctionalInterface
interface DemoForLambda{
	void show();
}

public class MyFirstDemo {

	public static void main(String[] args) {
		//datatype variable name=value;
		
		int var1=10;
		
		String str="Sujata";
		
//		datatype? fun=void show(){
//			System.out.println("Hello");
//		}

		DemoForLambda demoForLambda=new DemoForLambda() {
			@Override
			public void show() {
				System.out.println("Hello from anonymous inner class");
			}
		};
		
		DemoForLambda demoForLambda1=()-> System.out.println("Hello from lambda expression");
			
			
			demoForLambda1.show();
		
		
	}

}
