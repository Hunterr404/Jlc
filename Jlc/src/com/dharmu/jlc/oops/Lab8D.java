package com.dharmu.jlc.oops;
class Hello59 implements Interi1,Interi2{
	public void m1() {
		System.out.println("Hello--m1()");
	}
	public void m2() {
		System.out.println("Hello-->m2()");
	}
	public void m3() {
		System.out.println("Hello -->m3()");
		System.out.println(B);
		System.out.println(C);
		//System.out.println(A);//Reference to A is ambiguous
		System.out.println(Interi1.A);
		System.out.println(Interi2.A);
	}
}
public class Lab8D {

	public static void main(String[] args) {
		Hello59 h=new Hello59();
		Interi1 ref1=h;
		ref1.m1();
		ref1.m2();
		//ref1.m3();//The method m3() is undefined for the type Interi1
		 Interi2 ref2=h;
		 ref2.m2();
		 ref2.m3();
		//ref2.m1();//The method m1() is undefined for the type Interi2
		 

	}

}
