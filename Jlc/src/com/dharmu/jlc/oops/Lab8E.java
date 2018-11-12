package com.dharmu.jlc.oops;
interface Inter1i{
	void show();
}
	class A1{
		public void show() {
			System.out.println("A-->show()");
		}
	}
	class B1 extends A1 implements Inter1i{
		
	
}
public class Lab8E {

	public static void main(String[] args) {
		B1 ref = new B1();
		ref.show();

	}

}
