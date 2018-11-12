package com.dharmu.jlc.oops;

public class Day2G {

	public static void main(String[] args) {
		HelloA h= new HelloA();
		h.show();

	}

}
class HelloA{
	int a=10;
	static int b=20;
	void show() {
		//String a="JLC";
		String b="SD";
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(HelloA.b);
	}
}
