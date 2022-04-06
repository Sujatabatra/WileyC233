package com.sujata.demo;

public class MyThirdClass {

	public static void main(String[] args) {
		
//		PersonFactory personFactory=new PersonFactory() {
//			@Override
//			public Person createPerson(int id, String name) {
//				return new Person(id,name);
//			}
//		};
		
//		PersonFactory personFactory=(id, name)-> {
//				return new Person(id,name);
//		};

//		PersonFactory personFactory=(id,name)->new Person(id,name);
		
		PersonFactory personFactory=Person::new;

		Person person=personFactory.createPerson(101, "AAA");
		System.out.println(person);


	}

}
