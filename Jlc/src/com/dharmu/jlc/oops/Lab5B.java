package com.dharmu.jlc.oops;

public class Lab5B {

	public static void main(String[] args) {
		Hai4 hai=new Hai4();
		System.out.println(hai.a);
		
		
		Hello46 hello=new Hello46();
		System.out.println(hello.a);
		System.out.println(hello.b);

	}

}
class Hai4{
	int a=99;
}
class Hello46 extends Hai3{
	int b=88;
}