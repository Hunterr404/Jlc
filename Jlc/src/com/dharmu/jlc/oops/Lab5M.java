package com.dharmu.jlc.oops;

public class Lab5M {

	public static void main(String[] args) {
		Hello52 h=new Hello52();
		h.show();

	}

}
class Hai10{
	static int a=10;
}
class Hello52 extends Hai10{
	static int a=20;
	void show() {
		int a=30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println(Hello52.a);
		System.out.println(Hai10.a);
	}
}