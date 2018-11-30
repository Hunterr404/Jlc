package com.dharmu.jlc.javautil;

import java.util.*;
public class Lab2Q {

	public static void main(String[] args) {
		TreeSet set = new TreeSet(new NameComparator());
		set.add(new Student2Q(88,"Manish"));
		set.add(new Student2Q(44,"Sri"));
		set.add(new Student2Q(22,"Nivas"));
		set.add(new Student2Q(99,"Rahul"));
		set.add(new Student2Q(77,"Abhi"));
		Iterator it = set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		

	}

}
class Student2Q{
	int sid;
	String name;
	Student2Q(int sid, String name){
		this.sid = sid;
		this.name  = name;
	}
	public String toString() {
		return sid+"\t"+name;
	}
}
class NameComparator implements Comparator{
	public int compare(Object ob1 , Object ob2) {
		if(ob1 instanceof Student2Q && ob2 instanceof Student2Q) {
			Student2Q s1 = (Student2Q)ob1;
			Student2Q s2 = (Student2Q)ob2;
			return s1.name.compareTo(s2.name);
			
		}
		return 0;
	}
}