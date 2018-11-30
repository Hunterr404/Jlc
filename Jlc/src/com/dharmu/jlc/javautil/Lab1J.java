package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab1J {

	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add("JDBC");
		col.add("Sri");
		col.add("JSP");
		col.add("Dande");col.add("Sri");
		Collection col1 = new ArrayList();
		col1.add("Java");
		col1.add("JDBC");
		col1.add("JSP");
		System.out.println(col);
		System.out.println(col1);
		System.out.println(col.retainAll(col1));
		System.out.println(col);
		System.out.println(col1);

	}

}
