package com.dharmu.jlc.oops;
class Hello8L{
	{
		System.out.println("I.B-->Hello");
	}
	static {
		System.out.println("S.B-->Hello");
		class Inner3{}
	}
	Hello8L(){
		System.out.println("D.C --Hello");
		class Inner3{}
	}
	void m1() {
		System.out.println("m1-->Hello");
		class Inner3{};
	}
}
public class Lab8L {

	public static void main(String[] args) {
		System.out.println("Hello Guys");
	}

}
