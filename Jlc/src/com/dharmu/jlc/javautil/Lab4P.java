package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab4P {

	public static void main(String[] args) {
		String str = "hi This is JLC, Java Learning center";
		StringTokenizer tok = new StringTokenizer(str);
		System.out.println("Count :"+tok.countTokens());
		while(tok.hasMoreElements()) {
			String data = tok.nextToken();
			System.out.println(data);
		}
		System.out.println("Count: "+tok.countTokens());
		System.out.println("\n\nWith ,Delimeter\n");
		String data = "99,Srinivas,sri@jlc.com,65799999";
		StringTokenizer tkns = new StringTokenizer(data,",");
		int id = Integer.parseInt(tkns.nextToken());
		String nm = tkns.nextToken();
		String eml = tkns.nextToken();
		long phn = Long.parseLong(tkns.nextToken());
		System.out.println("id:"+id);
		System.out.println("Name:"+nm);
		System.out.println("Email:"+eml);
		System.out.println("Phone:"+phn);

	}

}
