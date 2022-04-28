package com.sujata.demo;

interface Inter1<T1>{
	
}
interface Integr2<T2>{
	
}

class MyBase<T3>{
	
}

class MyDerived<T3,T1,T2,Tx> extends MyBase<T3> implements Inter1<T1>,Integr2<T2>{
	
}
public class MyThirdGenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
