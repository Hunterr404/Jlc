package com.dharmu.jlc.oops;

public class Lab3J {

	public static void main(String[] args) {
		Hello32 h = new Hello32();
		h.show("JLC");
		h.show(h);
		//h.show(null);//The method show(String) is ambiguous for the type Hello32
		
	}

}
class Hello32{
	void show(String str) {
		System.out.println("Show(String)");
	}
	void show(Hello32 str) {
		System.out.println("Show(Hello32)");
	}
}
