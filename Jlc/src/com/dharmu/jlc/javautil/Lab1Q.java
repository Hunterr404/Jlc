package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab1Q {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("Sri");
		v.add("Nivas");
		v.add("Dande");
		v.add("SD");
		System.out.println(v);
		Enumeration enu = v.elements();
		while(enu.hasMoreElements())
			System.out.println(enu.nextElement());
	}

}
