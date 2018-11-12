package com.dharmu.jlc.javalangpackage;

public class Lab4U {

	public static void main(String[] args) {
		Hello4U h=Hello4U.getHello();
		System.out.println(Hello4U.getHello());
		System.out.println(Hello4U.getHello());

	}

}
class Hello4U{
	private static Hello4U INS = null;
	private Hello4U() {}
	public static Hello4U getHello() {
		if(INS==null)
			INS=new Hello4U();
		return INS;
	}
}