package com.dharmu.jlc.oops;

public class Day2D {

	public static void main(String[] args) {
		Student3 st=new Student3(88,"Srinivas");
		st.show();
		Student3 st1=new Student3(99,"Dande");
		st1.show();
		
	}

}
class Student3{
	int sid;
	String sname;
	Student3(int sid,String sname){
		System.out.println("Student 2-arg Constructor");
		sid=sid;
		sname=sname;
		
	}
	void show() {
		System.out.println(sid+"\t"+sname);
	}
}