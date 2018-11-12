package com.dharmu.jlc.oops;

public class Day2F {

	public static void main(String[] args) {
		Student5 st1=new Student5(77,"Sd");
		st1.show();
		Student5 stu=new Student5();
		//stu.Student5(88,"BD");//The method Student5(int, String) is undefined for the type Student5
	}

}
class Student5{
	int sid;
	String sname;
	Student5(int id,String name){
		System.out.println("Student5 2-arg Constructor");
		sid=id;
		sname=name;
	}
	Student5(){
		System.out.println("Student5 Default Constructor");
	}
	void show() {
		System.out.println(sid+"\t"+sname);
	}
}
