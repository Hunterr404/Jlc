package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab1E {

	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add("Sri");
		col.add("Srinivas");
		col.add("Dande");
		System.out.println(col+"\t\t\t"+col.size());
		Collection col1 = new ArrayList();
		col1.add("Java");
		col1.add("JDBC");
		col1.add("JSP");
		System.out.println(col1+"\t\t\t"+col1.size());
		col.add(col1);
		System.out.println(col+"\t"+col.size());

	}

}
