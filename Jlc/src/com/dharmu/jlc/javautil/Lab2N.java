package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab2N {

	public static void main(String[] args) {
		System.out.println("**EMPLOYEE INFO**");
		TreeSet set = new TreeSet();
		set.add(new Employee2N(87,"Sri"));
		set.add(new Employee2N(99,"Dande"));
		set.add(new Employee2N(12,"SD"));
		set.add(new Employee2N(45,"Nivas"));
		Iterator it = set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}
class Employee2N implements Comparable{
	int eid;
	String name;
	Employee2N(int eid, String name){
		this.eid = eid;
		this.name  = name;
	}
	public int compareTo(Object obj) {
		if(obj instanceof Employee2N) {
			Employee2N em = (Employee2N) obj;
		return this.name.compareTo(em.name);
		}
		return 0;
	}
	public String toString() {
		return eid+"\t"+name;
	}
}