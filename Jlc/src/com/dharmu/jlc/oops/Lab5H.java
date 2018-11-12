package com.dharmu.jlc.oops;

public class Lab5H {

	public static void main(String[] args) {
		Hello50 h=new Hello50();

	}

}
class Hai8{
	{
		System.out.println("Hai--> I.B");
	}
	static {
		System.out.println("Hai-->S.B");
	}
}
class Hello50 extends Hai8{
	{
		System.out.println("Hello -->I.B");
	}
	static {
		System.out.println("Hello-->S.B");
	}
}
