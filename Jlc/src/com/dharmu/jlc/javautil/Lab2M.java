package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab2M {

	public static void main(String[] args) {
		System.out.println("**STUDENT INFO**");
		TreeSet set = new TreeSet();
		set.add(new Student2M(87,"Sri"));
		set.add(new Student2M(99,"Dande"));
		set.add(new Student2M(12,"SD"));
		set.add(new Student2M(45,"Nivas"));
		Iterator it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}
class Student2M implements Comparable{
	int sid;
	String name;
	Student2M(int sid, String name){
		this.sid = sid;
		this.name  = name;
	}
	public int compareTo(Object obj) {
		if(obj instanceof Student2M) {
			Student2M st = (Student2M) obj;
		return this.sid - st.sid;
		}
		return 0;
	}
	public String toString() {
		return sid+"\t"+name;
	}
}