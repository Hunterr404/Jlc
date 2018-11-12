package com.dharmu.jlc.javalangpackage;

public class Lab1 {

	public static void main(String[] args) {
		showClassInfo("JLC");
		Student stu = new Student();
		showClassInfo(stu);
		Object obj1=new Object();
		showClassInfo(obj1);
		
	}
	static void showClassInfo(Object obj) {
		Class cls=obj.getClass();
		System.out.println("Class Name: "+cls.getName());
		Class scls=cls.getSuperclass();
		if(scls!=null)
			System.out.println("Super Class :"+scls.getName());
		else
			System.out.println("NO Super Class");
	}
	
}
class Person{}
class Student extends Person{}