package com.dharmu.jlc.oops;

public class Lab4D {

	public static void main(String[] args) {
		Hello37 h = new Hello37();
		h.sum(12, 23);
		h.sum(12, 32, 43);
	}

}
class Hello37{
	void sum(int a,int b) {
		System.out.println("--Sum(int,int)");
		System.out.println(a+b);
	}
	void sum(int a,int b,int c) {
		System.out.println("--Sum(int,int,int)");
		System.out.println(a+b+c);
	}
}
