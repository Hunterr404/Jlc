package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab1 {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("Sri");
		v.addElement("Vas");
		v.addElement("Dande");
		System.out.println(v);
		Enumeration en = v.elements();
		while(en.hasMoreElements()) {
			Object obj = (Object) en.nextElement();
			System.out.println(obj);
		}

	}

}
