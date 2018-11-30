package com.dharmu.jlc.javautil;
import java.util.*;
public class lab2G {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new Student2(99));
		set.add(new Student2(99));
		set.add(new Student2(99));
		set.add(new Student2(99));
		set.add(new Student2(99));
		System.out.println(set);

	}

}
class Student2{
	int sid;
	Student2(int sid){
		this.sid =sid;
		
	}
	public String toString() {
		System.out.println("**hashCode()**");
		return ""+sid;
	}
	public boolean equals(Object obj) {
		System.out.println("**equals()**");
		if(obj instanceof Student) {
			Student st = (Student)obj;
			return this.sid==st.sid;
		}
		return false;
	}
}