package com.dharmu.jlc;

public class Lab10 {

	public static void main(String[] args) {
		int a=12;
		boolean b=a>10 && a++ <5;
		System.out.println(a);
		System.out.println(b);
		boolean c=a>15 && a++<5;
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println();
		
		int d=36;
		boolean b1=d>20 || d++<5;
		System.out.println(d);
		System.out.println(b1);
		System.out.println();
		
		boolean b2= d>40 || d++<5;
		System.out.println(d);
		System.out.println(b2);
		System.out.println();
		
		class Hello{		
		}
		class Hai{
		}
		Hello h1 = new Hello();
		Hai h2 = new Hai();
		System.out.println(h1);
		System.out.println(h2);
		
}
}