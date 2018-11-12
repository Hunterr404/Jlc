package com.dharmu.jlc.oops;

public class Lab3G {

	public static void main(String[] args) {
		Hello27 h=new Hello27();
		int a=h.add(10, 20);
		System.out.println(a);
		String b=h.add("JLC", 99);
		System.out.println(b);
		Hello28 h1=new Hello28();
		byte m=20;
		h1.add1(10, m);
		h1.add1(m, m);
		Hello29 h2=new Hello29();
		byte n=20;
		h2.add2(n, 10);
		h2.add2(n, n);
	}

}
class Hello27{
	int add(int a,int b) {
		System.out.println("add(int,int)");
		return a+b;
}

String add(String a,int b) {
	System.out.println("add(String,int)");
	return a+b;
}
}

class Hello28{
	void add1(int a,byte  b) {
		System.out.println("add(int,byte)");
		
}
}

class Hello29{
	void add2(byte a,int b) {
		System.out.println("add(byte,int)");
		
}
}