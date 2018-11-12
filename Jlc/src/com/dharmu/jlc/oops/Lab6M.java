package com.dharmu.jlc.oops;

public class Lab6M {

	public static void main(String[] args) {
		B6M bobj = new B6M();
		bobj.m1();

	}

}
class A6M{
	static void m1() {
		System.out.println("a-->m1()");
	}
}
class B6M extends A6M{
	static void m1() {
		System.out.println("B--m1()");
	}
}