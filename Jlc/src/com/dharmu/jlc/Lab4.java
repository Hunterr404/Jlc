package com.dharmu.jlc;

public class Lab4 {

	public static void main(String[] args) {
		byte b1=13;
		byte b2=18;
		//byte b3=b1+b2;(default value for Arithmetic operation is int
		int b3=b1+b2;
		System.out.println(b3);
		
		final int a=123;
		byte b=a;
		System.out.println(b);
		
		int a1=124;
		//byte b1=a1;
		
		final byte x1=67;
		final byte x2=13;
		byte x3=x1+x2;
		System.out.println(x3);
		final long l1=23;
		//byte l2=l1;
		System.out.println(20/3);
		System.out.println(20/3.0f);
		System.out.println(20/3.0);
		System.out.println(20/0.0);
		System.out.println(20/-0.0);
		System.out.println(20.0/0);
		System.out.println(-20.0/0);
		double d1=10/0.0;
		System.out.println(d1);
		System.out.println(0/0.0);
		System.out.println(0.0/0);
		System.out.println(-0.0/0.0);
		System.out.println(0.0/0.0);
		double d2=0/0.0;
		System.out.println(d2);
		//System.out.println(12/0);//(Exception)
		//System.out.println(0/0);//(Exception)
		
		int k1=90;
		int k2=71;
		int k3=k1+k2-15;
		int k4=k1+k2+79;
		int m1=30;
		int m2=10;
		int m3=5;
		int m4=m1+m2*m3;
		int m5=(m1+m2)*m3;
		int m6=m1-m2/m3;
		int m7=(m1+m2)/m3;
		System.out.println(k3);
		System.out.println(k4);
		System.out.println(m4);
		System.out.println(m5);
		System.out.println(m6);
		System.out.println(m7);
	}

}
