package com.dharmu.jlc.oops;

public class Lab7A {

	public static void main(String[] args) {
		A13 obj = new B13();
		System.out.println(obj.x);
		System.out.println(obj.y);

	}

}
class A13{
	int x=10;
	static int y=20;
	
}
class B13 extends A13{
	String x="Jlc";
}