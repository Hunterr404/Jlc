package com.dharmu.jlc;

public class Lab5 {

	public static void main(String[] args) {
		int a=80;
		int b=10;
		System.out.println(a+b+"is Result");
		System.out.println("result is " +a+b);
		System.out.println("Result is"+(a+b));
		System.out.println(a-b+"isResult");
		//System.out.println("result is " + a-b);
		System.out.println("result is " +(a+b));
		System.out.println("result is " +a+-b);
		System.out.println("result is " +a+(-b));
		
		String str=""+a;
		String str1=a+"";
		System.out.println(a);
		System.out.println(str);
		System.out.println(str1);
		
		int c=a+b;
		String str2="Sum of "+a+" and "+b+" is "+c;
		System.out.println(str2);
		System.out.printf("\nSum of %d and %d is %d.\n",a,b,c);
		
		int d=15+12;
		System.out.println(d);
		//int e=12<23;
		//int d1=1233L;
		//long c1=123.45;
		boolean m1=12<34;
		long m2=123L;
		double m3=123.45;
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
	}

}
