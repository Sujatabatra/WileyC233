package com.sujata.training;

public class MySingletonClassMain {

	public static void main(String[] args) {
		MySingletonClass referenceVariable;
		
//		referenceVariable=new MySingletonClass();
		
		referenceVariable=MySingletonClass.getInstance();
		System.out.println(referenceVariable);
		
		referenceVariable.show();
		
		MySingletonClass referenceVariable1=MySingletonClass.getInstance();
		System.out.println(referenceVariable1);
		

	}

}
