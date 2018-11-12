package com.dharmu.jlc.oops;
class Outer4{
	int a=10;
	static int b=20;
	void show() {
		System.out.println("Outer-->show() Begin");
		class Inner{
			void m1() {
				System.out.println("Inner-->m1()");
				System.out.println(a);
				System.out.println(b);
			}
		}
		new Inner().m1();
		System.out.println("Outer -->show() End");
	}
}
public class Lab8M {

	public static void main(String[] args) {
		Outer4 out=new Outer4();
		out.show();
	}

}
