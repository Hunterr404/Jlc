package com.dharmu.jlc.oops;
interface inter1{
	void m1();
	public abstract void m2();
	int A=10;
	public final int B=20;
}
class Hello55 implements inter1{
	public void m1() {
		System.out.println("Hello -->m1");
	}
	public void m2() {
		System.out.println("Hello-->m2");
	}
}
public class Lab8{

	public static void main(String[] args) {
		/*inter1 ref=null;
		ref=new inter1();//Interface can't be initiated
		ref=new hello55();
		ref.m1();
		ref.m2();
		*/
		System.out.println("Hello Guys");
	}

}
