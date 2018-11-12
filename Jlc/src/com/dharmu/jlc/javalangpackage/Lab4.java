package com.dharmu.jlc.javalangpackage;

public class Lab4 {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("JLC");
		System.out.println("C :"+sb.capacity());
		System.out.println("L :"+sb.length());
		sb.trimToSize();
		System.out.println("C : "+sb.capacity());
		System.out.println("L :"+sb.length());
		System.out.println("\n");
		
		String str="JLC";
		System.out.println(str.contentEquals(sb));
	}

}
