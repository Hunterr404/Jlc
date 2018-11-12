package com.dharmu.jlc.oops;
abstract class Person1{
	abstract void sleeping();
}
abstract class Student7D extends Person{
	void sleeping() {
		System.out.println("Student Sleeping");
	}
}
/*class CurrentStudent extends Student7D{//The type CurrentStudent must implement the inherited abstract method Person.walking()
}
public class Lab7D {

	public static void main(String[] args) {
		Person pob=new CurrentStudent();
		pob.sleeping();
		

	}

}
*/