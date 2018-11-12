package com.dharmu.jlc.javalangpackage;

public class Lab3O {

	public static void main(String[] args) {
		String str="JLCINDIA";
		System.out.println(str.substring(0));
		System.out.println(str.substring(3));
		System.out.println(str.substring(0, 4));
		System.out.println(str.substring(3,5));
		
		//System.out.println(str.substring(3, 9));//java.lang.StringIndexOutOfBoundsException
		System.out.println("\n");
		
		
		int len=str.length();
		System.out.println(len);
		System.out.println(str.substring(3, len));
		System.out.println(str.substring(3, len-1));
		System.out.println(str.substring(3, len-3));
		System.out.println("\n");
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		System.out.println();
		for(int i=0;i<str.length();i++) {
			System.out.println(i+"\t"+str.charAt(i));
		}
		System.out.println("\n");
		
		char cArr[]=str.toCharArray();//Converts this string to a new character array.
		System.out.println("\n**char array**");
		for(int i=0; i<cArr.length;i++) {
			char ch=cArr[i];
			System.out.println(i+"\t"+ch);
		}
		byte bArr[]=str.getBytes();//Converts this string to a new byte Array using ASCII
		System.out.println("\n**byte array");
		for(int i=0;i<bArr.length;i++) {
			byte b=bArr[i];
			System.out.println(i+"\t"+b+"\t"+(char)b);
		}
	}

}
