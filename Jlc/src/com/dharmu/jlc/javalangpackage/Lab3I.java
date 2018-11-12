package com.dharmu.jlc.javalangpackage;

public class Lab3I {

	public static void main(String[] args) {
		String st1="JLC";
		String st2="INDIA";
		String st3=st1.concat(st2);//Not in SCP
		System.out.println(st3);
		String st4="JLCINDIA";
		System.out.println(st3==st4);
		System.out.println("\n");
		
		final int x = 10;
		System.out.println("X="+x=="X"+x);
		System.out.println("X="+x);
		final int a=10;
		System.out.println("A="+a=="A="+a);
		
		System.out.println("\n");
		int ab=98;
		int bc=98;
		//System.out.println("Result is :"+ ab==bc);//Incompatible operand types String and int
		System.out.println("\n");
		System.out.println("Result is :"+(ab==bc));
	}

}
