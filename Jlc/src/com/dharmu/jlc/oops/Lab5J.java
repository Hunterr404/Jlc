package com.dharmu.jlc.oops;

public class Lab5J {

	public static void main(String[] args) {
		new C6();
	}

}
class A6{
	A6(){
		System.out.println("A-->D.C");
	}
}
class B6 extends A6{
	B6(){
		System.out.println("B-->D.C");
	}
}
class C6 extends B6{
	C6(){
		System.out.println("C-->D.C");
	}
}