package com.dharmu.jlc.oops;

public class Lab6I {

	public static void main(String[] args) {
		new B6I().m1();

	}

}
class A6I{
	private void m1() {
		
	}
}
class B6I extends A6I{
	int m1() {
		return 0;
	}
}