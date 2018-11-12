package com.dharmu.jlc.oops;

public class lab5K {

	public static void main(String[] args) {
		new C7();
	}
}
class A7{
	A7(){
		System.out.println("A-->D.C");
	}
	static {
		System.out.println("A-->S.B");
	}
	{
		System.out.println("A-->I.B");
	}
}
class B7 extends A7{
	B7(){
		System.out.println("B-->D.C");
	}
	static {
		System.out.println("B-->S.B");
	}
	{
		System.out.println("B--I.B");
	}
}
class C7 extends B7{
	C7(){
		System.out.println("C-->D.C");
	}
	static {
		System.out.println("C==>S.B");
	}
	{
		System.out.println("C-->I.B");
	}
}