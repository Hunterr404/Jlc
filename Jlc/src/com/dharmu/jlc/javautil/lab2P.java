package com.dharmu.jlc.javautil;
import java.util.*;
public class lab2P {

	public static void main(String[] args) {
		TreeSet set = new TreeSet(new SidComparator());
		set.add(new Student2P(88,"Manish"));
		set.add(new Student2P(44,"Sri"));
		set.add(new Student2P(22,"Nivas"));
		set.add(new Student2P(99,"Rahul"));
		set.add(new Student2P(77,"Abhi"));
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
class Student2P{
	int sid;
	String name;
	Student2P(int sid, String name){
		this.sid = sid;
		this.name  = name;
	}
	public String toString() {
		return sid+"\t"+name;
	}
}
class SidComparator implements Comparator{
	public int compare(Object ob1 , Object ob2) {
		if(ob1 instanceof Student2P && ob2 instanceof Student2P) {
			Student2P s1 = (Student2P)ob1;
			Student2P s2 = (Student2P)ob2;
			return s1.sid-s2.sid;
		}
		return 0;
	}
}