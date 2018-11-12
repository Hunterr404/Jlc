package com.dharmu.jlc.oops;

public class Lab6L {

	public static void main(String[] args) {
		B6L1 bobj=new B6L1();
		bobj.m1();

	}

}
class A6L{
	public void m1() {
		System.out.println("A-->m1()");
	}
}
class B6L extends A6L{
	//protected void m1() {}//Cannot reduce the visibility of the inherited method  from A6L
	
}
class B6L1 extends A6L{
	public void m1() {
		System.out.println("B-->m1()");
		super.m1();
	}
}