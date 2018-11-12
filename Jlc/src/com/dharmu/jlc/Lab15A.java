package com.dharmu.jlc;

public class Lab15A {

	public static void main(String[] args) {
		for (int i=1;i<=10;i++) {
			System.out.println(i);
			System.out.println(i);
			int a=99;
			a++;
			System.out.println(i+"\t"+a);
		}System.out.println();
		/* Infinite Loop
		 * for(;;)
		 *System.out.println("JLC");
		*/
		
		/*Infinite Loop
		 * boolean b=true;
		for(;b;)
			System.out.println("JLC");
		System.out.println("After");
		*/
		final boolean b=true;
		for(;b;) 
			System.out.println("JLC");
			//System.out.println("After");//Unreachable Code
		
	}

}
