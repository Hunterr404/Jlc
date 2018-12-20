package com.dharmu.jlc.reflection;
import java.lang.reflect.*;
public class Lab8 {

	public static void main(String[] args) throws ClassNotFoundException{
		String cname = "com.dharmu.jlc.reflection.Hai";
		Class cl = Class.forName(cname);
		System.out.println("\n **PUBLIC FIELDS**");
		Field[] pFlds = cl.getFields();
		for(int i=0; i<pFlds.length;i++) {
			Field f = pFlds[i];
			System.out.println(f);
		}
		System.out.println("\n**ALL DECLARED FIELDS**");
		Field[] aFlds = cl.getDeclaredFields();
		for(int i=0; i<aFlds.length;i++) {
			Field f = aFlds[i];
			System.out.println(f);
		}
		
	}

}
