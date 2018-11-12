package com.dharmu.jlc.javalangpackage;

public class Lab4T {

	public static void main(String[] args) {
		Hello4T h = Hello4T.getHello();
		System.out.println(h);
		System.out.println(Hello4T.getHello());
		System.out.println(Hello4T.getHello());
	}

}
class Hello4T{
	private static Hello4T INS = null;
	static {
		INS = new Hello4T();
	}
	private Hello4T() {}
	public static Hello4T getHello(){
		return INS;
	}
	
}