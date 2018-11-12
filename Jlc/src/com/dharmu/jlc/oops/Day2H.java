package com.dharmu.jlc.oops;

public class Day2H {

	public static void main(String[] args) {
		Student6 st1=new Student6(88,"Srinivas");
		st1.show();
		Student6 st2=new Student6(99,"Dande");
		st2.show();//Local variable will be cleaned from Memory
	}

}
class Student6{
	int sid;
	String name;
	Student6(int sid,String name){
		System.out.println("Student6 2 arg Constructor");
		sid=sid;
		name=name;
	}

void show() {
	System.out.println(sid+"\t"+name);
}
}