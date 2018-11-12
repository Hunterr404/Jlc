package com.dharmu.jlc.oops;
class Outer1{
	int a=11;
	class Inner1{
		int a=22;
		void show() {
			System.out.println("Inner-->show()");
			int a=33;
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(Inner1.this.a);
			//System.out.println(super.a);
			System.out.println(Outer1.this.a);
		}
	}
}
public class Lab8J {

	public static void main(String[] args) {
		new Outer1().new Inner1().show();
	}

}
