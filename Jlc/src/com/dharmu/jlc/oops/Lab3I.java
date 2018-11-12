package com.dharmu.jlc.oops;

public class Lab3I {

	public static void main(String[] args) {
		Hello31 h = new Hello31();
		h.show(null);
		h.show("JLC");
		h.show(h);

	}

}
class Hello31{
	void show(String str) {
		System.out.println("Show(String)");
	}
	void show(Object str) {
	System.out.println("Show(Object)");
}
}	