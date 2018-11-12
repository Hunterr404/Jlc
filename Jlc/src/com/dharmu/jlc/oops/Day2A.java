package com.dharmu.jlc.oops;

public class Day2A {

	public static void main(String[] args) {
		Student1 s1=new Student1(87,"Shantam","abc@abc.com",989898);
		s1.show();
		Student1 s2=new Student1(123,"Badshah","bbc");
		s2.show();
		Student1 s3=new Student1(45,"Babaji");
		s3.show();
		Student1 s4 = new Student1();
		s4.show();
		//s4.Student1(77,"SD");//The method Student1(int, String) is undefined for the type Student1
		
		
	}

}
class Student1{
	int sid;
	String sname;
	String email;
	long phone;
	Student1(int id,String sn,String em,long ph){
		System.out.println("Student 4-Arg Constructor");
		sid=id;
		sname=sn;
		email=em;
		phone=ph;
	}
	Student1(int id,String sn,String em){
		System.out.println("Student 3-Arg Constructor");
		sid=id;
		sname=sn;
		email=em;
	}
	Student1(int id,String sn){
		System.out.println("Student 2-Arg Constructor");
		sid=id;
		sname=sn;
	}
	Student1(){
		System.out.println("Student1 Default Constructor");
	}
	void show() {
		System.out.println(sid+"\t"+sname+"\t"+email+"\t"+phone);
	}
}