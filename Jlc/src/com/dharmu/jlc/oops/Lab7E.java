package com.dharmu.jlc.oops;
abstract class Hello7A{
	static int A=1234;
	static void show() {
		System.out.println("Hello Show");
	}
	}

public class Lab7E {

	public static void main(String[] args) {
		System.out.println(Hello7A.A);
		Hello7A.show();
	}

}
