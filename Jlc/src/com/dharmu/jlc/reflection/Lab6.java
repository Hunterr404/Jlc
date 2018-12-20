package com.dharmu.jlc.reflection;
import java.lang.reflect.*;
public class Lab6 {

	public static void main(String[] args) throws Exception {
		String cname = "com.dharmu.jlc.reflection.Hai";
		Class cl = Class.forName(cname);
		System.out.println("\n PUBLIC CONTRUCTORS**");
		Constructor[] pCons =  cl.getConstructors();
		for(int i=0;i<pCons.length;i++) {
			System.out.println(pCons[i]);
		}
		System.out.println("\n**DECLARED CONSTRUCTORS**");
		Constructor[] aCons = cl.getDeclaredConstructors();
		for(int i=0;i<aCons.length;i++) {
			System.out.println(aCons[i]);
		}
	}

}
