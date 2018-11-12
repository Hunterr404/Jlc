package com.dharmu.jlc;
	class Hello{
	}
public class lAB11 {

	public static void main(String[] args) {
		Hello h = new Hello();
		System.out.println(h instanceof Hello);
		System.out.println(h instanceof Object);
		//System.out.println(h instanceof String);
		System.out.println();
		
		Object obj = new Hello();
		System.out.println(obj instanceof String);
		System.out.println(obj instanceof Hello);
		System.out.println(obj instanceof Object);
		System.out.println();
		
		Hello h1 = null;
		String str = null;
		System.out.println(h1 instanceof Hello);
		System.out.println(str instanceof String);
		System.out.println();
		
		int a = true?10:20;
		int b = false? 10:20;
		System.out.println(a);
		System.out.println(b);
		
		//int a1=20>10 ? 10:20.0;
		double d=20>10 ? 10:20.0;
		//int x = 10>20 ? 10:TWENTY;
		//String str2 = 10>20 ?10:"TWENTY";
		//Object obj = 10>20 ? 10:"TWENTY";
		System.out.println();
		
		int x=10;
		int y=20;
		int max = x>y?x:y;
		System.out.println(max);
		int min = x<y?x:y;
		System.out.println(min);
		System.out.println();
		
		int x1 = 10;
		int y1 = 20;
		int z1 = 14;
		int max1 = (x1>y1)?((x1>z1) ? x1:z1):((y1>z1)?y1:z1);
		System.out.println(max1);
		
		
	}

}
