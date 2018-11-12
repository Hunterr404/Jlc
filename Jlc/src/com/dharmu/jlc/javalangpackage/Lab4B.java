package com.dharmu.jlc.javalangpackage;

public class Lab4B {

	public static void main(String[] args) {
		int a=123;
		//String s1=a;//Type mismatch: cannot convert from int to String
		//String s2=(String)a;// Cannot cast from int to String
		 String s3=""+a;
		 String s4=a+"";
		 System.out.println(s3);
		 System.out.println(s4);
		 String s5=String.valueOf(a);
		 System.out.println(s5);
		 String s6=Integer.toString(a);
		 System.out.println(s6);

	}

}
