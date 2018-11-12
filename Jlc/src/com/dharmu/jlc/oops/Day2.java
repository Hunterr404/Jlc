package com.dharmu.jlc.oops;

public class Day2 {

	public static void main(String[] args) {
		Student st1=new Student();
		st1.show();
		Student st2=new Student();
		st2.show();
		Student stu1=new Student();
		stu1.sid=99;
		stu1.sname="Djwale babu";
		stu1.show();
		Student s1=new Student(87,"Srinivas");
		s1.show();
		Student s2=new Student(97,"Dande");
		s2.show();
	}

}
class Student{
	int sid;
	String sname;
	Student(){
		System.out.println("Student Default Constructor");
	}
	Student(int id,String sn){
		sid=id;
		sname=sn;
	}
	void show() {
		System.out.println(sid+"\t"+sname);
	}
}