package com.dharmu.jlc.oops;

public class Lab1D {
	public static void main(String[] args) {
		Hello3 h = new Hello3();
		System.out.println("Main"+h.c);
		System.out.println("Main"+Hello3.d);
		
		
		
	}

}
class Hello3{
		/*int a;
		a=12;*/
		/*static int b;
		b=121;*/
		int c;
		static int d;
		{
			c=12;
			System.out.println("Initialized"+c);
			d=14;
			System.out.println("Initialized"+d);
		}
		
	}