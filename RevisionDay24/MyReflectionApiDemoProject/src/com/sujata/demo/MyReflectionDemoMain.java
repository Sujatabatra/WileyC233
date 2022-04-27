package com.sujata.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyReflectionDemoMain {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		MyReflectionDemo obj = new MyReflectionDemo();

		System.out.println("Class Name : " + obj.getClass());

		Class cls = obj.getClass();

		Constructor constructor = cls.getConstructor();

		System.out.println("Constructor name : " + constructor.getName());

		Method[] methods = cls.getMethods();
		for (Method method : methods) {
			System.out.println("method name :" + method.getName());
		}
		Method methodCall = cls.getDeclaredMethod("display", int.class);

		try {
			methodCall.invoke(obj, 25);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
