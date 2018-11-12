package com.dharmu.jlc.oops;
interface inter2{
	void m1();
	public abstract void m2();
	int A=10;
	public final int B=20;
}
abstract class Hello56 implements inter1{
	public void m1() {
		System.out.println("Hello -->m1");
	}
	}
	class Hai47 extends Hello56{
		public void m2() {
		System.out.println("Hello-->m2");
	}
	void m3() {
		System.out.println("Hai-->m3");
	}
	
}
public class Lab8A {

	public static void main(String[] args) {
		inter1 ref=new Hai47();
		ref.m1();
		ref.m2();
		//ref.m3();
	}

}
