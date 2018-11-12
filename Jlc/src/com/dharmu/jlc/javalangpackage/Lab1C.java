package com.dharmu.jlc.javalangpackage;

public class Lab1C {

	public static void main(String[] args) {
		Student1C st1 = null;
		System.out.println(st1);
		st1=new Student1C(99,"Sri");
		System.out.println(st1);
		String str=new String("java Learning Center");
		System.out.println(str);
		Integer ref= new Integer(123);
		System.out.println(ref);
	}

}
class Student1C{
	int sid;
	String name;
	Student1C(int sid, String name){
		this.sid=sid;
		this.name=name;
	}
}