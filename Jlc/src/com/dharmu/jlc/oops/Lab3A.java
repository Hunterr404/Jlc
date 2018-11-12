package com.dharmu.jlc.oops;

public class Lab3A {

	public static void main(String[] args) {
		Hello10.show();
		Hello11.show();
	}

}

class Hello10{
	int a;
	static int b;
	static void show() {
		//System.out.println(a);//Cannot make a static reference to the non-static field 
		System.out.println(b);
	}
}

class Hello11{
	static int b;
	static void show() {
		System.out.println(b);
	}
}