package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab2O {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(new Student2M(99,"Sri"));
		System.out.println(set);
		set.add(new Student2O(99,"Dande"));//java.lang.ClassCastException--class com.dharmu.jlc.javautil.Student2O cannot be cast to class java.lang.Comparable
		set.add(new Student2O(12,"SD"));
		set.add(new Student2O(45,"Nivas"));

	}

}
class Student2O{
	int sid;
	String name;
	Student2O(int sid, String name){
		this.sid = sid;
		this.name  = name;
	}
	public String toString() {
		return sid+"\t"+name;
	}
}