package com.dharmu.jlc.reflection;
import java.lang.reflect.*;
public class Lab9 {

	public static void main(String[] args) throws ClassNotFoundException{
		String cname = "com.dharmu.jlc.reflection.Hai";
		Class cl = Class.forName(cname);
		System.out.println("\n **PUBLIC INNER CLASSES**");
		Class[] plnCls = cl.getClasses();
		for(int i=0; i<plnCls.length;i++) {
			Class c = plnCls[i];
			System.out.println(c);
		}
		System.out.println("\n** DECLARED INNER CLASSES**");
		Class[] alnCls = cl.getDeclaredClasses();
		for(int i=0; i<alnCls.length;i++) {
			Class c = alnCls[i];
			System.out.println(c);
		}
	}

}
