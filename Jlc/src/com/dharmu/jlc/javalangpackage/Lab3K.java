package com.dharmu.jlc.javalangpackage;

public class Lab3K {

	public static void main(String[] args) {
		Student3K stu=new Student3K();
		String st1=String.valueOf(stu);//valueOf(Object obj)- the value of obj.toString() is returned.
		System.out.println(st1);
		Employee3K emp=new Employee3K();
		String st2=String.valueOf(emp);
		System.out.println(st2);//returns overridden toString() values ie- Eid:0 
		
		Student3K stu1=null;
		String st=String.valueOf(stu1);
		System.out.println(st);
		
		String s=String.valueOf(null);//java.lang.NullPointerException
		System.out.println(s);
	}

}
class Student3K{
	
}
class Employee3K{
	int eid;
	public String toString(){
		return "Eid:"+eid;
	}
}