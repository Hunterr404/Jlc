package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab3J {

	public static void main(String[] args) {
		ArrayList<String> emails = new ArrayList<String>();
		emails.add("sri@jlc.com");
		emails.add("dk@jlc.com");
		emails.add("mk@jlc.com");
		ArrayList<Long> phones = new ArrayList<Long>();
		phones.add(555555L);
		phones.add(6666666L);
		phones.add(77777777L);
		LinkedHashMap<String,Long> refs = new LinkedHashMap<String,Long>();
		refs.put("Dande", 1111111L);
		refs.put("Kumar", 222222222222L);
		refs.put("Ranjan", 3333333333L);
		Student3J stu = new Student3J(99,"Srinivas",emails,phones,refs);
		ArrayList<Student3J>stList = new ArrayList<Student3J>();
		stList.add(stu);
		stList.add(stu);
		stList.add(stu);
		stList.add(stu);
		stList.add(stu);
		System.out.println(stList);
	}

}
class Student3J{
	int sid;
	String name;
	List<String>emails;
	List<Long >phones;
	Map<String,Long> refs;
	public Student3J(int sid,String name,List<String>emails,List<Long>phones,Map<String,Long>refs) {
		this.sid=sid;
		this.name=name;
		this.emails=emails;
		this.phones=phones;
		this.refs=refs;
		
	}
	public String toString() {
		return "\n"+sid+"\n"+name+"\n"+emails+"\n"+phones+"\n"+refs+"\n";
	}
}