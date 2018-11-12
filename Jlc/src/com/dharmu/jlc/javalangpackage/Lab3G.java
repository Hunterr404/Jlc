package com.dharmu.jlc.javalangpackage;

public class Lab3G {

	public static void main(String[] args) {
		String st1="JLC99";
		String st2="JLC";
		final int ab=99;//Not in SCP
		String st3=st2+ab;
		String st4="JLC"+99;//gets refrence from SCP created by st3
		System.out.println(st1+"\t"+st3);
		System.out.println(st1==st3);
		System.out.println(st1==st4);//True
	}

}
