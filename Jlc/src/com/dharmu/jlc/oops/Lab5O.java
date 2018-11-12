package com.dharmu.jlc.oops;

public class Lab5O {

	public static void main(String[] args) {
		new B9(10);

	}

}
class A9{
	A9(){
		System.out.println("A-->D.C");
	}
}
class B9 extends A9{
	B9(){
		System.out.println("B--D.C");
	}
	B9(int a){
		this();
	System.out.println("B9(int)");
}
}
