package com.dharmu.jlc.javalangpackage;

public class Lab2A {

	public static void main(String[] args) {
		Student2A st1=new Student2A(99,"Sri");
		Student2A st2=new Student2A(99,"Sri");
		Student2A st3=new Student2A(88,"Manish");
		Student2A st4=st1;
		System.out.println("Using ==operator");
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		System.out.println(st1==st4);
		System.out.println(st2==st3);
		
		System.out.println("Using equals()");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st4));
		System.out.println(st2.equals(st3));

	}

}
class Student2A{
	int sid;
	String sname;
	Student2A(int sid,String sname){
		this.sid=sid;
		this.sname=sname;
	}
}