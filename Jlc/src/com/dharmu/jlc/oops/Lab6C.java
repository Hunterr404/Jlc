package com.dharmu.jlc.oops;
class Hello6C{
	void m1() {
		System.out.println("Hello-->m1()");
	}
	void m2() {
		System.out.println("Hello-->m2()");
	}
}
class Hai6C extends Hello6C{
	void m2() {
		System.out.println("Hai-->m2()");
	}
	void m3() {
		System.out.println("Hai-->m3()");
	}
}
public class Lab6C {

	public static void main(String[] args) {
		Hai6C hai=new Hai6C();
		hai.m1();
		hai.m2();
		hai.m3();

	}

}
