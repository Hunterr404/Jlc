package com.dharmu.jlc.javalangpackage;

public class Lab4F {

	public static void main(String[] args) {
		String str = "12345";
		Integer in = new Integer(str);
		System.out.println(in);
		String st2 = "123";
		Byte by = new Byte(st2);
		System.out.println(by);
		Boolean b1 = new Boolean("TrUE");
		System.out.println(b1);
		Boolean b2 = new Boolean("JLC");
		System.out.println(b2);
		//Integer in2 = new Integer("12.0");// java.lang.NumberFormatException: For input string: "12.0"
		String st = "A";
		Character ch = new Character(st.charAt(0));
	}

}
