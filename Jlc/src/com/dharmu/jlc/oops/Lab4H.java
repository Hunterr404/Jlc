package com.dharmu.jlc.oops;

public class Lab4H {

	public static void main(String[] args) {
		Hello41 h = new Hello41();
		//h.m1();//The method m1(int[]) is ambiguous for the type Hello41
				

	}

}
class Hello41{
	void m1(int...a) {
		System.out.println("m1(int...)");
	}
	void m1(String...a) {
		System.out.println("m1(String...)");
	}
}