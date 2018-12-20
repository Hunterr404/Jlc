package com.dharmu.jlc.reflection;

public class Lab1 {

	public static void main(String[] args) {
		String className = "com.dharmu.jlc.reflection.Hello";
		try {
			Class cls = Class.forName(className);
			System.out.println("class loaded Successfully");
			System.out.println("class Name :"+cls.getName());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
class Hello{
	
}