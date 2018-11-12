package com.dharmu.jlc.oops;

public class Lab6K {

	public static void main(String[] args) {
		new B6K().m1();

	}

}
class A6K{
	protected void m1() {}
	protected void m2() {}
}
class B6K extends A6K{
	//private void m1() {}//Cannot reduce the visibility of the inherited method from A6K
	//void m2() {}//Cannot reduce the visibility of the inherited method from A6K
	 
}
class B6K1 extends A6K{
	protected void m1() {}
	public void m2() {}
}