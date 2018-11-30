package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab2F {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new Student(99));
		set.add(new Student(99));
		set.add(new Student(99));
		set.add(new Student(99));
		set.add(new Student(99));
		System.out.println(set);

	}

}
class Student{
	int sid;
	Student(int sid){
		this.sid =sid;
		
	}
	public String toString() {
		return ""+sid;
	}
}