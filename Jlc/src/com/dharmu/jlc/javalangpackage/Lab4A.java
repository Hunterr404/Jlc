package com.dharmu.jlc.javalangpackage;

public class Lab4A {

	public static void main(String[] args) {
		String str="A";
		StringBuilder sb=new StringBuilder("A");
		System.out.println(str.hashCode());
		System.out.println(sb.hashCode());
		System.out.println("\n");
		
		StringBuilder sb1=new StringBuilder("A");
		System.out.println(sb.equals(sb1));
		String str1=sb.toString();
		System.out.println(str1);
		String str2=sb1.toString();
		System.out.println(str1.equals(str2));
		

	}

}
