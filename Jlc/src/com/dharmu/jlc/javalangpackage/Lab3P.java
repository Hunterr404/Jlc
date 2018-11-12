package com.dharmu.jlc.javalangpackage;

public class Lab3P {

	public static void main(String[] args) {
		char cArr[]= {'J','L','C','I','N','D','I','A'};
		byte bArr[]= {65,66,67,97,98,99,49,50};
		String st1=new String(cArr);
		String st2=new String(bArr);
		System.out.println("st1: "+st1);
		System.out.println("st2: "+st2);
		System.out.println("\n");
		
		String st3=new String(cArr,3,5);
		String st4=new String(bArr,3,5);
		System.out.println("st3: "+st3);
		System.out.println("st4: "+st4);
		System.out.println("\n");
		
		
		String str="Jlc, Java Learning Center.No 1 in Java Training and Placement. Java is a Popular language.";
		String res[]=str.split("Java");
		System.out.println("Length: "+res.length);
		for(int i=0;i<res.length;i++) {
			String st=res[i];
			System.out.println(i+"\t"+st);
		}
		System.out.println("\n");
		
		String res1[]=str.split("Java",1);
		System.out.println("Length: "+res1.length);
		for(int i=0;i<res1.length;i++) {
			String st=res1[i];
			System.out.println(i+"\t"+st);
		}System.out.println("\t");
		
		String res2[]=str.split("Java", 2);
		System.out.println("res2Length: "+res2.length);
		for(int i=0;i<res2.length;i++) {
			String st=res2[i];
			System.out.println(i+"\t"+st);
		}
		System.out.println("\n");
		String res3[]=str.split("Java", 0);
		System.out.println("Length: "+res3.length);
		for(int i=0;i<res3.length;i++) {
			String st=res3[i];
			System.out.println(i+"\t"+st);
		}
		System.out.println("\n");
		
		String res4[]=str.split("Java", 5);
		System.out.println("Length: "+res4.length);
		for(int i=0;i<res4.length;i++) {
			String st=res4[i];
			System.out.println(i+"\t"+st);
		}
	}

}
