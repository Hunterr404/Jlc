package com.dharmu.jlc.oops;

public class Day2E {

	public static void main(String[] args) {
		Student4 st1=new Student4(99,"Sri","sri@jlc",99999);
		st1.show();
		Student4 st2=new Student4(88,"vas","vas@jlc");
		st2.show();
		Student4 st3=new Student4(77,"SD");
		st3.show();
		Student4 st4=new Student4();
		st4.show();
	}

}
class Student4{
	int sid;
	String name;
	String email;
	long phone;
	Student4(int id,String sn,String em,long ph){
		System.out.println("Student4 4-arg Constructor");
		sid=id;
		name=sn;
		email=em;
		phone=ph;
	}
	Student4(int id,String sn,String em){
		System.out.println("Student4 3-arg Constructor");
		sid=id;
		name=sn;
		email=em;
}
	Student4(int id,String sn){
		System.out.println("Student4 2-arg Constructor");
		sid=id;
		name=sn;
		
	}
	Student4(){
		System.out.println("Student4 Default Constructor");
		
}
	void show() {
		System.out.println(sid+"\t"+name+"\t"+email+"\t"+phone);
	}
}