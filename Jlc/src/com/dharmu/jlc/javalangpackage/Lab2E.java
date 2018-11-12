package com.dharmu.jlc.javalangpackage;

public class Lab2E {

	public static void main(String[] args) {
		new Hello2E().show();
		Hello2E h1=new Hello2E();
		h1=null;
		Hello2E h2=new Hello2E();
		Hello2E h3=new Hello2E();
		h2=h3;
		new Hello2E().m1();
		//System.runFinalization();
		System.gc();

	}

}
class Hai2E{
	public void finalize() {
		System.out.println("Hai Finalize");
	}
}
class Hello2E{
	void show() {
		System.out.println("show()");
	}
	void m1() {
		System.out.println("m1 Start");
		Hai2E hai1=new Hai2E();
		Hai2E hai2=new Hai2E();
		Hai2E hai3=new Hai2E();
	}
	public void finalize() {
		System.out.println("hello finalize()");
	}
}