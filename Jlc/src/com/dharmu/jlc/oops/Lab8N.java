package com.dharmu.jlc.oops;
abstract class Person8N{
	public abstract void sleeping();
}
class Student8N  extends Person8N{
	public void sleeping() {
		System.out.println("Student Sleeping");
	}
}
public class Lab8N {

	public static void main(String[] args) {
		Person8N p=new Student8N();
		p.sleeping();
		//Person8N stu = new Person8N();
		//Person8N stu1 = new Person8N() {};//The type new Person8N(){} must implement the inherited abstract method Person8N.sleeping() 
		Person8N stu2 = new Person8N() {
			public void sleeping() {
				System.out.println("Student Sleeping");
			}
		};
		stu2.sleeping();
	}

}
