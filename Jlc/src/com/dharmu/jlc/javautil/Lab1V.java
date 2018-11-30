package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab1V {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");
		list.add("Java");
		list.add("JDBC");
		list.add("JSP");
		ListIterator lit = list.listIterator();
		while(lit.hasNext()) {
			Object obj = lit.next();
			System.out.println(obj);
		}
	}

}
