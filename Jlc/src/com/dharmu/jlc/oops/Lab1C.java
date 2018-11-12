package com.dharmu.jlc.oops;

public class Lab1C {
	static int b;
	int a;
	public static void main(String[] args) {
		System.out.println(b);
		//System.out.println(a);//Cannot make a static reference to the non-static field a
		int c;
		//System.out.println(c);//The local variable c may not have been initialized
		c=13;
		System.out.println(c);
	}

}
