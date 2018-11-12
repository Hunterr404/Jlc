package com.dharmu.jlc.javalangpackage;
import java.util.Scanner;
public class Lab3C {

	public static void main(String[] args) {
		String st1="JLC";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter JLC String: ");
		String st3=sc.nextLine();
		System.out.println("Re Enter JLC String:");
		String st4=sc.nextLine();
		String st5=st3.intern();
		String st6=st4.intern();
		System.out.println(st3==st4);//False- means st3 & st4 are not in String Constant Pool
		System.out.println(st5==st6);
		System.out.println(st1==st5);
	}

}
