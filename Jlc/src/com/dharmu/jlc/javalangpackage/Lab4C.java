package com.dharmu.jlc.javalangpackage;

public class Lab4C {

	public static void main(String[] args) {
		String str="99";
		int a=Integer.parseInt(str);
		byte b1=Byte.parseByte("88");
		String s1="A";
		char ch=s1.charAt(0);
		System.out.println(ch);
		//byte b2=Byte.parseByte("129");// java.lang.NumberFormatException: Value out of range. Value:"129" Radix:10
		//int x=Integer.parseInt("9898989898988");// java.lang.NumberFormatException
		//int y=Integer.parseInt("123.0");// java.lang.NumberFormatException
	}

}
