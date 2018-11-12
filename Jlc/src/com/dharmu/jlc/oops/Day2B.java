package com.dharmu.jlc.oops;

public class Day2B {

	public static void main(String[] args) {
		Student2 st=new  Student2();
		st.Student1(88, "MK");
		st.show();
		//Student2 stu=new Student2(77,"Sd");

	}

}
class Student2{
	int sid;
	String sname;
	void Student1(int id,String name) {
		System.out.println("2 Arg Constructor");
		sid=id;
		sname=name;
	}
	Student2(){
		System.out.println("Student default Constructor");
	}
	void show() {
		System.out.println(sid+"\t"+sname);
	}
}
