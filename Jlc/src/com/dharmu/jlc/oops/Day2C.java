package com.dharmu.jlc.oops;

public class Day2C {

	public static void main(String[] args) {
		Hello5 h=new Hello5();
		h.show();
	}

}
class Hello5{
	int a=10;
	static int b=20;
	void show() {
		String a="Jlc";
		String b="Jd";
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a); 
		System.out.println(this.b);
		System.out.println(Hello5.b);
	}
}
