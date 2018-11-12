package com.dharmu.jlc.oops;

public class Lab1 {

	public static void main(String[] args) {
		Hello h= new Hello();
		Hello h1=new Hello();
		System.out.println(h.a);
		System.out.println(h1.a);
		h.a=99;
		System.out.println(h.a+"\t"+h1.a);
		new Hello().a=88;
		System.out.println(new Hello().a);
		Hello h2=null;
		//System.out.println(h2.a);  //causes java.lang.NullPointerException
		//System.out.println(Hello.a);  //Cannot make a static reference to the non-static field Hello.a
	}

}
class Hello{
	int a;
}
