package com.dharmu.jlc.oops;

class Hello57 implements Interi1,Interi2{
	public void m1() {
		System.out.println("Hello--m1()");
	}
	public void m2() {
		System.out.println("Hello-->m2()");
	}
	public void m3() {
		System.out.println("Hello -->m3()");
		System.out.println(B);
		System.out.println(C);
		//System.out.println(A);//Reference to A is ambiguous
		System.out.println(Interi1.A);
		System.out.println(Interi2.A);
	}
}
public class Lab8C  {

	public static void main(String[] args) {
		Hello57 h = new Hello57();
		h.m1();
		h.m2();
		h.m3();
	}

}
