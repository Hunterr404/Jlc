package com.dharmu.jlc.oops;

public class Lab1B {
			
	public static void main(String[] args) {
		System.out.println(Hello2.b);
		Hello2 h=null;
		System.out.println(h.b);
		new Hello2().b=99;
		System.out.println(new Hello2().b);
		
		
		
		
	}

}
	class Hello2{
		static int b;
	}