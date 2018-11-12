package com.dharmu.jlc.oops;

public class Lab5F {

	public static void main(String[] args) {
		new Hello48();
	}

}
class Hai6{
	static int a=99;
	static {
		System.out.println("Hai-->S.B");
	}
}
class Hello48 extends Hai6{
	static int b=88;
	static {
		System.out.println("hello-->S.B:"+a);
		System.out.println("hello-->S.B:"+b);
	}
}
