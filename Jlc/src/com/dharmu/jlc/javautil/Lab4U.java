package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab4U {

	public static void main(String[] args) {
		String str = "Hi This is JLC.";
		Scanner sc = new Scanner(str);
		while(sc.hasNext()) {
			String st = sc.next();
			System.out.println(st);
		}
		sc.close();
		System.out.println("***********");
		String str2 = "Hi This is JLC. Java Training center. No 1 in Java Training";
		Scanner sc1 = new Scanner(str2);
		sc1.useDelimiter("\\.");
		while(sc1.hasNext()) {
			String st = sc1.next();
			System.out.println(st);
		}
		sc1.close();
	}

}
