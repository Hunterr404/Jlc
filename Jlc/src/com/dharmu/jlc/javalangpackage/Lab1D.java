package com.dharmu.jlc.javalangpackage;

public class Lab1D {

	public static void main(String[] args) {
		Student1D st=new Student1D(99,"Sri");
		System.out.println(st);
		System.out.println("\n****default Implementation");
		String cname=st.getClass().getName();
		int hc=st.hashCode();
		String hx=Integer.toHexString(hc);
		String msg=cname+ "@"+hx;
		System.out.println(msg);
	}

}
class Student1D{
	int sid;
	String name;
	Student1D(int sid, String name){
		this.sid=sid;
		this.name=name;
	}
}