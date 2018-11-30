package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab1A {

	public static void main(String[] args) {
		Properties p = new Properties();
		p.put("JLC-99", "Sri");
		p.put("Jlc-88", "Vas");
		p.put("Jlc-77", "dande");
		System.out.println(p);
		Enumeration en = p.propertyNames();
		while(en.hasMoreElements()) {
			String pnm = (String)en.nextElement();
			String val = p.getProperty(pnm);
			System.out.println(pnm+"\t\t"+val);
		}
	}

}
