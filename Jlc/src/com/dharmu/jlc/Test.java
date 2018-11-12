package com.dharmu.jlc;

public class Test {
	boolean b;
	byte b1;
	short s;
	int a=16;
	
	long l;
	float f;
	double d=99.9;
	Test t;
	String str="JLC",str1="Study";
	
	char c='C';
	void show() {
		System.out.println(b);
		System.out.println(b1);
		System.out.println(s);
		System.out.println(a);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(t);
		System.out.println(str);
		System.out.println(str1);
		System.out.println(c);
	}

	public static void main(String[] args) {
		Test te = new Test();
		te.show();
		

	}

}
