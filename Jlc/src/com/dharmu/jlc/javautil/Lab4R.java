package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab4R {

	public static void main(String[] args) throws Exception {
		String languageCode = "en";
		System.out.println("H->Hindi, E->English");
		System.out.println("Enter Your Choice");
		int asc = System.in.read();
		char ch = (char)asc;
		ch = Character.toUpperCase(ch);
		if(ch=='H') {
			System.out.println("\t**You Have Selected Hindi");
			languageCode="hi";
		}else if(ch=='E') {
			System.out.println("\t**You Have Selected English");
			languageCode="en";
		}else {
			System.out.println("\t**INVALID INPUT, Using Default Language");
		}
		Locale locale = new Locale(languageCode);
		ResourceBundle rbRef = ResourceBundle.getBundle("messages",locale);
		Enumeration en = rbRef.getKeys();
		while(en.hasMoreElements()) {
			String key = en.nextElement().toString();
			String val = rbRef.getString(key);
			System.out.println(key+"\t"+val);
		}
		
	}

}
