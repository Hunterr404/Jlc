package com.dharmu.jlc.oops;
class Outer2{
	int a=10;
	static int b=20;
	void m1() {
		System.out.println("Outer-->m1()");
	}
	void m2() {
		System.out.println("Outer-->m2()");
	}
	static class Inner2{
		int x=11;
		static int y=22;
		void show() {
			System.out.println("Inner-->show()");
			System.out.println(b);
			System.out.println(y);
			System.out.println(x);
			//m2();//Cannot make a static reference to the non-static method m2() from the type Outer2
		}
		static void m3() {
			System.out.println("Inner-->m3()");
		}
	}
}
public class Lab8K {

	public static void main(String[] args) {
		Outer2 outob=new Outer2();
		outob.m1();
		outob.m2();
		Outer2.Inner2 inob=new Outer2.Inner2();
		inob.show();
		inob.m3();
		

	}

}
