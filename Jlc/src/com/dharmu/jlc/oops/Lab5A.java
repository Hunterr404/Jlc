package com.dharmu.jlc.oops;

public class Lab5A {

	public static void main(String[] args) {
		
		Hai3 hai=new Hai3();
		System.out.println(hai.a);
		//System.out.println(hai.b);
		
		Hello45 hello=new Hello45();
		System.out.println(hello.a);
		System.out.println(hello.b);

	}

}
class Hai3{
	int a=99;
}
class Hello45 extends Hai3{
	int b=88;
}