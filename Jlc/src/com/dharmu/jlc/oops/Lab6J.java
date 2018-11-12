package com.dharmu.jlc.oops;

public class Lab6J {

	public static void main(String[] args) {
		new B6J1().m1();

	}

}
class A6J{
	void m1() {}
	void m2() {}
	void m3() {}
	
}
/*class B6J extends A6J{
	private void m1() {//Cannot reduce the visibility of the inherited method from A6J
		
	}
}*/
class B6J1 extends A6J{
	void m1() {
		
	}
	protected void m2() {}
	public void m3() {}
}