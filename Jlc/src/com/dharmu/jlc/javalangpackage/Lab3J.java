package com.dharmu.jlc.javalangpackage;

public class Lab3J {

	public static void main(String[] args) {
		String st1=new String("JLC");
		String st2=new String("JLC");
		String st3=new String("jlc");
		System.out.println(st1+"\t"+st2+"\t"+st3);
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		System.out.println(st1.equals(st2));//Compares Contents
		System.out.println(st1.equals(st3));
		System.out.println(st1.equalsIgnoreCase(st3));
		System.out.println("\n");
		
		System.out.println("ABC".compareTo("ABC"));//Compares Unicode Values, (-) means this* String precedes the argument string
		System.out.println("ABC".compareTo("ADO"));
		System.out.println("ABC".compareTo("ABCDEFG"));
		System.out.println("ABCDEFG".compareTo("ABC"));
		System.out.println("ABC".compareTo("DEF"));
		System.out.println("ABC".compareTo("abc"));
		System.out.println("ABC".compareToIgnoreCase("abc"));
		System.out.println("\n");
		
		int ab=98;
		/*
		String str1 = ab;//Type mismatch: cannot convert from int to String
		String str2 = (String)ab;//Cannot cast from int to String
		*/
		String str3=String.valueOf(ab);//Returns the string representation of the int argument
		String str4=String.valueOf(true);
		System.out.println(str3+"\t"+str4);
		
	}

}
