package com.dharmu.jlc.oops;

public class Lab4B {

	public static void main(String[] args) {
		Hai hai=new Hai();
		hai.a=99;
		Hello35 h=new Hello35();
		System.out.println("Main Begin: "+hai.a);
		h.m1(hai);
		System.out.println("Main Ends: "+hai.a);
	}

}
class Hello35{
	void m1(Hai hai) {
		System.out.println("m1 Begin : "+hai.a);
		hai.a=hai.a+10;
		System.out.println("m1 Ends: "+hai.a);
	}
}
class Hai{
	int a;
}

