package com.dharmu.jlc.reflection;
import java.lang.reflect.*;
public class Lab7 {

	public static void main(String[] args) throws ClassNotFoundException{
		String cname = "com.dharmu.jlc.reflection.Hai";
		Class cl = Class.forName(cname);
		System.out.println("\n PUBLIC METHODS**");
		Method[] pMthd = cl.getMethods();
		for(int i=0;i<pMthd.length;i++) {
			Method m = pMthd[i];
			System.out.println(m);
		}
		System.out.println("\n**DECLARED METHOD**");
		Method[] aMthd = cl.getDeclaredMethods();
		for(int i=0;i<aMthd.length;i++) {
			Method m = aMthd[i];
			System.out.println(m);
		}
	}

}
