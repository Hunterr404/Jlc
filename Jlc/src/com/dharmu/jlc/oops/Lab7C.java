package com.dharmu.jlc.oops;
abstract class Person{
	abstract void sleeping();
	abstract void walking();
}
abstract class Student7A extends Person{
	void sleeping() {
		System.out.println("Student Sleeping");
	}
}
class CurrentStudent extends Student7A{
	void walking() {
		System.out.println("Current student Walking");
	}
}
public class Lab7C {

	public static void main(String[] args) {
		Person pob=new CurrentStudent();
		pob.sleeping();
		pob.walking();

	}

}
