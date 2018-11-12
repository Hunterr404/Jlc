package com.dharmu.jlc.javalangpackage;

public class Lab4W {

	public static void main(String[] args) {
		for(int i=0;i<10;i++)
			System.out.println(Hello4W.getHello());

	}

}
class Hello4W{
	private static Hello4W h1 = new Hello4W();
	private static Hello4W h2 = new Hello4W();
	private Hello4W() {}
	public static Hello4W getHello() {
		if(Math.random()>0.5)
			return h1;
		else
			return h2;
	}
}