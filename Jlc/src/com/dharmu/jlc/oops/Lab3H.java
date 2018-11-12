package com.dharmu.jlc.oops;

public class Lab3H {

	public static void main(String[] args) {
		Hello30 h = new Hello30();
		byte b=20;
		h.add(b, 10);
		h.add(10, b);
		//h.add(b, b);//The method add(byte, int) is ambiguous for the type Hello30
		

	}

}

class Hello30{
	void add(byte a,int b) {
		System.out.println("add(byte,int)");	
}
	void add(int a,byte b) {
		System.out.println("add(int,byte)");

}
}