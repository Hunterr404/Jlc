package com.dharmu.jlc.javalangpackage;

public class Lab4V {

	public static void main(String[] args) {
		Hello4V h = Hello4V.getHello();
		System.out.println(h);
		System.out.println(Hello4V.getHello());
		System.out.println(Hello4V.getHello());
	}

}
class Hello4V{
	private static Hello4V INS = new Hello4V();
	private Hello4V() {}
	public static Hello4V getHello() {
		return INS;
	}
	protected Object clone() {
		return this;
	}
}