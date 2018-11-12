package com.dharmu.jlc.oops;

public class Lab5L {

	public static void main(String[] args) {
		Hello51 h=new Hello51();
		h.show();

	}

}
class Hai9{
	int a=10;
}
class Hello51 extends Hai9{
	int a=20;
	void show() {
		int a=30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}