package com.dharmu.jlc.oops;
interface inter3{
	void m1();
	int A=10;
}
interface inter4{
	void m2();
	int B=11;
}
class hello58 implements inter3, inter4{
	public void m1() {
		System.out.println("Heloo-->m1()");
	}
	public void m2() {
		System.out.println("Hello -->m2()");
	}
}
public class Lab8B {

	public static void main(String[] args) {
		/*Hello58 h= new Hello58();//Cannot instantiate the type Hello56
		 
		System.out.println(h.A);
		System.out.println(h.B);
		h.m1();
		h.m2();*/
		/*inter3 i3=new Hello58();//Cannot instantiate the type Hello56
		i3.m1();
		i3.m2();
		*/
		/*inter4 i4=new Hello58();//Cannot instantiate the type Hello56
		i4.m1();
		i4.m2();*/
	}

}
