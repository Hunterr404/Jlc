package com.dharmu.jlc.javalangpackage;

public class Lab4I {

	public static void main(String[] args) {
		Long val1 = 127L;
		Long val2 = 127L;
		System.out.println(val1==val2);
		Long val3 = 128L;
		Long val4 = 128L;
		System.out.println(val3==val4);
		System.out.println("\n");
		
		
		Float f1 = 12.23F;
		Float f2 = 12.23F;
		System.out.println(f1==f2);
		Double d1=12.23;
		Double d2=12.23;
		System.out.println(d1==d2);
		System.out.println("\n");
		
		Integer in1 = 596;
		Integer in2 = 596;
		System.out.println(in1==in2);
		Long va1 = 596L;
		Long va2 = 596L;
		System.out.println(va1==va2);
		System.out.println("\n");
		
		Integer i1 = 123;
		Integer i2 = 124;
		System.out.println(i1==i2);
		i1++;
		System.out.println(i1==i2);
		System.out.println("\n");
		
		Object obj=123;
		Number num = 123L;
		System.out.println(obj);
		System.out.println(num);
		System.out.println("\n");
		
		Long l1=123L;
		Double l2= 12.23;
		System.out.println(l1);
		System.out.println(l2);
	}

}
