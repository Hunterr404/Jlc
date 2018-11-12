package com.dharmu.jlc.javalangpackage;

public class Lab4H {

	public static void main(String[] args) {
		Byte by1 = 123;
		Byte by2 = 123;
		System.out.println(by1==by2);
		byte b = 123;
		Byte b1 = new Byte(b);
		Byte b2 = new Byte(b);
		System.out.println(b1==b2);
		System.out.println("\n");
		
		Boolean bo1=true;
		Boolean bo2=true;
		System.out.println(bo1==bo2);
		boolean bo3 = true;
		Boolean b3=new Boolean(bo3);
		Boolean b4=new Boolean(bo3);
		System.out.println(b3==b4);
		System.out.println("\n");
		
		Integer in1 = 127;
		Integer in2 = 127;
		System.out.println(in1==in2);
		Integer in3 = 128;
		Integer in4 = 128;
		System.out.println(in3==in4);
		System.out.println("\n");
		
		Character ch1 = 'A';
		Character ch2 = 'A';
		System.out.println(ch1==ch2);
		Character ch3 = (char)171;
		Character ch4 = (char)171;
		System.out.println(ch3==ch4);

	}

}
