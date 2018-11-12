package com.dharmu.jlc;

public class Lab15B {

	public static void main(String[] args) {
		byte b = 127;
		b++;
		System.out.println(b);
		for(byte by=10;by>0;by++) 
			System.out.println(by);
		
		int val = 2147483640;
		for(;val>200;val++)
			System.out.println(val);;
		System.out.println("After Loop :"+ val);
	}

}
