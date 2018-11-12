package com.dharmu.jlc.oops;

public class Lab5N {

	public static void main(String[] args) {
		new B8();
	}

}
class A8{
	A8(int a){
		System.out.println("A8(int) Cons");
	}
}
class B8 extends A8{
	B8(){
		super(20);
		System.out.println("B-->D.C");
		//super(10);//Constructor call must be the first statement in a constructor
	}
}