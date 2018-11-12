package com.dharmu.jlc.javalangpackage;

public class Lab1A {

	public static void main(String[] args) {
		System.out.println("\n***With Student");
		Student1A st1=new Student1A(99,31903290);
		Student1A st2=new Student1A(99,31903290);
		Student1A st3=new Student1A(88,65799999);
		Student1A st4=st1;
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode());
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		System.out.println(st1==st4);
		System.out.println(st3==st4);
	}

}
class Student1A{
	int sid;
	long phone;
	Student1A(int sid, long phone){
		this.sid=sid;
		this.phone=phone;
	}
}