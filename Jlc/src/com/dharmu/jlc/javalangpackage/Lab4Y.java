package com.dharmu.jlc.javalangpackage;

public class Lab4Y {

	public static void main(String[] args) {
		Student4Y st = new Student4Y(99,"Srinivas",65799999);
		System.out.println(st);

	}

}
final class Student4Y{
	private final int sid;
	private final String name;
	private final long phone;
	public Student4Y(int sid,String name,long phone) {
		this.sid=sid;
		this.name=name;
		this.phone=phone;
	}
	public int getSid() {
		return sid;
	}
	public String getName() {
		return name;
		
	}
	public long getPhone() {
		return phone;
	}
	public String toString() {
		return "sid +:"+sid+ ",Name :"+name+",Phone : "+phone;
	}
}
