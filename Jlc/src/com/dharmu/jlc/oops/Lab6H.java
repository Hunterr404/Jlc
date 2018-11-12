package com.dharmu.jlc.oops;

public class Lab6H {

	public static void main(String[] args) {
		//B6H.m1();//Cannot make a static reference to the non-static method m1() from the type B6H
		 B6H.m2();

	}

}
class A6H{
	void m1() {
		
	}
	static void m2() {
		
	}
}
class B6H extends A6H{
	void m1() {
		
	}
	static void m2() {
		
	}
}