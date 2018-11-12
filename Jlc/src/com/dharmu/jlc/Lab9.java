package com.dharmu.jlc;

public class Lab9 {

	public static void main(String[] args) {
		System.out.println('A'==65);
		byte b=65;
		System.out.println('A'== b);
		System.out.println('A' == 65L);
		System.out.println('A'== 65.0);
		System.out.println('A'== 65.0F );
		System.out.println("\n");
		
		double d1 = 13/3.0F;
		double d2 = 13/3.0;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d1==d2);
		System.out.println();
		
		System.out.println(10>20);
		System.out.println(10<20);
		System.out.println(10>=20);
		System.out.println(10<=20);
		System.out.println(10>=10);
		System.out.println(10<=10);
		System.out.println(10==10);
		System.out.println(10==12);
		System.out.println();
		
		System.out.println(true==true);
		System.out.println(true==false);
		System.out.println(true!=false);
		System.out.println();
		
		
		int a=18;
		System.out.println(a==a);
		//System.out.println("Result is:"+ a==a);
		System.out.println("Result is:" + (a==a));
		System.out.println();
		
		System.out.println(!true);
		System.out.println(!false);
		int a1=10;
		//System.out.println(!a1);
		System.out.println(!(a1==10));
		System.out.println();
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println();
		
		
	}

}
