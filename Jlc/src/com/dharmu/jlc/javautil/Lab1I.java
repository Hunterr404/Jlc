package com.dharmu.jlc.javautil;

import java.util.ArrayList;
import java.util.Collection;

public class Lab1I {

	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add("JDBC");
		col.add("Sri");
		col.add("JSP");
		col.add("Srinivas");
		col.add("Java");
		col.add("Dande");
		Collection col1 = new ArrayList();
		col1.add("Java");
		col1.add("JDBC");
		col1.add("JSP");
		System.out.println(col);
		System.out.println(col.removeAll(col1));//true
		System.out.println(col);
		System.out.println(col1);
	}

}
