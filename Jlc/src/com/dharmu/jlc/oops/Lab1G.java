package com.dharmu.jlc.oops;
public class Lab1G {

	public static void main(String[] args) {
		System.out.println("Main"+HelloAB1.a);
	}

}
class HelloAB1{
	static int a;
	int b;
	static {
		a=10;
		//b=20;//Cannot make a static reference to the non-static field b
		System.out.println("Initialized "+a);
	}
}