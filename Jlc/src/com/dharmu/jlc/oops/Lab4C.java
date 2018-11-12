package com.dharmu.jlc.oops;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Lab4C {

	public static void main(String[] args) {
		Hai hai=new Hai();
		hai.a=99;
		Hello36 hello = new Hello36();
		System.out.println("Main Begin :"+hai.a);
		hello.m1(hai);
		System.out.println("Main Ends :"+hai.a);

	}

}
class Hello36{
	void m1(Hai hai) {
		System.out.println("m1 begin"+hai.a);
		hai=new Hai();
		hai.a = hai.a+10;
		System.out.println("m1 Ends "+hai.a);
		
		
	}
}
class Hai1{
	int a;
}