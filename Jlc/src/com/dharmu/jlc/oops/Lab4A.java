package com.dharmu.jlc.oops;

public class Lab4A {

	public static void main(String[] args) {
		int a=99;
		Hello34 h= new Hello34();
		System.out.println("Main Begins: "+a);
		h.m1(a);
		System.out.println("Main ends "+a);
	}

}
class Hello34{
	void m1(int a) {
		System.out.println("m1 begin: "+ a);
		a=a+10;
		System.out.println("m1 ends: "+a);
	}
}