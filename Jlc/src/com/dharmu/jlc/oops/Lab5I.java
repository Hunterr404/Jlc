package com.dharmu.jlc.oops;

public class Lab5I {

	public static void main(String[] args) {
		new B5();

	}

}
class A5{
	A5(){
		System.out.println("A-->D.C");
	}
}
class B5 extends A5{
	B5(){
		System.out.println("B-->D.C");
	}
}