package com.dharmu.jlc.javalangpackage;

public class Lab1E {

	public static void main(String[] args) {
		Student1E st1=new Student1E(99,"Sri");
		Student1E st2=new Student1E(88,"Nivas");
		System.out.println(st1);
		System.out.println(st2);
	}

}
class Student1E{
	int sid;
	String name;
	Student1E(int sid, String name){
		this.sid=sid;
		this.name=name;
	}
	public String toString() {
		return sid + "\t" + name;
	}
}