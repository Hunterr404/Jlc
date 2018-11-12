package com.dharmu.jlc.javalangpackage;

public class Lab2B {

	public static void main(String[] args) {
		Student2B st1=new Student2B(99,"Sri");
		Student2B st2=new Student2B(99,"Sri");
		Student2B st3=new Student2B(88,"Manish");
		Student2B st4= st1;
		System.out.println("Using ==op");
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		System.out.println(st1==st4);
		System.out.println(st1==st3);
		
		System.out.println("Using equals()");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st4));
		System.out.println(st2.equals(st3));

	}

}
class Student2B{
	int sid;
	String sname;
	Student2B(int sid,String sname){
		this.sid=sid;
		this.sname=sname;
	}
public boolean equals(Object obj) {
	if(obj instanceof Student2B) {
		Student2B st=(Student2B)obj;
		return this.sid==st.sid && this.sname.equals(st.sname);
	}
	return false;
}
}