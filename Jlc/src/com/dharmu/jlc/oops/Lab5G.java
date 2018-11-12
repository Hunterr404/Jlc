package com.dharmu.jlc.oops;

public class Lab5G {

	public static void main(String[] args) {
		new Hello49();
	}

}
class Hai7{
	int a=99;
	{
		System.out.println("Hai-->i.B:"+a);
	}
}
class Hello49 extends Hai7{
	int b=88;
	{
		System.out.println("Hello-->I.B:"+a);
		System.out.println("Hello--.I.B:"+b);
	}
}