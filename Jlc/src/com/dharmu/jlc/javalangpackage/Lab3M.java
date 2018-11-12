package com.dharmu.jlc.javalangpackage;

public class Lab3M {

	public static void main(String[] args) {
		String str="JLC";
		String str1=str.trim();//trim whitespace from begining and end of a String
		System.out.println(str+"\t"+str1);
		System.out.println(str==str1);
		String str2=" JLC";
		String str3=str2.trim();
		System.out.println(str2==str3);
		System.out.println(str2+"\t"+str2.length());
		System.out.println(str3+"\t"+str3.length());
		
		
		String st="";
		System.out.println(st.length());
		System.out.println(st.isEmpty());//Returns true if, and only if, length() is 0.
		
		
		String st1="Hai, Welcome to JLC";
		System.out.println(st1.startsWith("Hai"));
		System.out.println(st1.startsWith("Welcome"));
		System.out.println(st1.startsWith("Welcome", 5));
		
		System.out.println(st1.endsWith("JLC"));
		System.out.println(st1.endsWith("Welcome"));
		System.out.println();
		System.out.println(st1.startsWith(""));
		System.out.println(st1.endsWith(""));
	}

}
