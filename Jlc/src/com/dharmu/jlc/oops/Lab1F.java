package com.dharmu.jlc.oops;
public class Lab1F {

	public static void main(String[] args) {
		System.out.println("Main"+HelloAB.a);
	}

}
class HelloAB{
	static int a;
	static {
		a=10;
		System.out.println("Initialized"+a);
	}
}