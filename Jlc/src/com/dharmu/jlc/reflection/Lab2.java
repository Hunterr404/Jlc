package com.dharmu.jlc.reflection;

public class Lab2 {

	public static void main(String[] args) {
	showClassInfo("OK");
	showClassInfo(new Lab1());
	showClassInfo(new com.dharmu.jlc.Cc1());
	Hello2 h = new Hello2();
	showClassInfo(h);
	}
	static void showClassInfo(Object obj) {
		Class cls = obj.getClass();
		System.out.println("\nClass Name :" +cls.getName());
	}

}
class Hello2{
	
}