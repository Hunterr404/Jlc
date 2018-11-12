package com.dharmu.jlc.oops;

public interface Inter1B {
int AB=90;
}
class Hello60{
	String AB="JLC";
}
class Hai60 extends Hello60 implements Inter1B{
	void show() {
		System.out.println(super.AB);
		System.out.println(Inter1B.AB);
		//System.out.println(AB);//The field AB is ambiguous
	}
}
