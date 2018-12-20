package com.dharmu.jlc.annotation;

public class Lab4 {

	public static void main(String[] args) {
		Employee1 em = new Employee1(99,"Sri");
		System.out.println(em);
		
	}

}
class Employee1{
	int eid;
	String name;
	Employee1(int eid,String name){
		this.eid=eid;
		this.name=name;
	}
	@Override
	public String toString() {
		return eid+"\t"+name;
	}
}