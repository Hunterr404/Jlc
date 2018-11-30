package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab4A {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Srinivas");
		list.add("dande");
		list.add("Anand");
		list.add("Kumar");
		System.out.println(list);
		System.out.println("\n List to ENUMERATION");
		Enumeration enm=Collections.enumeration(list);
		while(enm.hasMoreElements())
			System.out.println(enm.nextElement());
		Vector v = new Vector();
		v.add(99);
		v.add("Sri");
		v.add("sri@jlc.com");
		System.out.println("\n Enumeration to LIST");
		Enumeration enu = v.elements();
		List info = Collections.list(enu);
		System.out.println(info);
	}

}
