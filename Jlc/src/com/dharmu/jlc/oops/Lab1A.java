package com.dharmu.jlc.oops;

public class Lab1A {
	int a;
	public static void main(String[] args) {
		//System.out.println(a);  //Cannot make a static reference to the non-static field a
		Hello1 h=new Hello1();
		Hello1 h1=new Hello1();
		System.out.println(h.b);
		System.out.println(h1.b);
		h.b=99;
		System.out.println(h.b);
		System.out.println(h1.b);
		
	}

}
	class Hello1 {
		static int b;
	}