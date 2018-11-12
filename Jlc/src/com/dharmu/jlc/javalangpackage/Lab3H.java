package com.dharmu.jlc.javalangpackage;

public class Lab3H {

	public static void main(String[] args) {
		String st1="JLC99";
		final String st2="JLC";
		final int ab=99;
		String st3=st2+ab;//gets reference from SCP
		String st4="JLC"+99;//gets reference from SCP
		System.out.println(st1+"\t"+st3+"\t"+st4);
		System.out.println(st1==st3);
		System.out.println(st1==st4);

	}

}
