package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab4 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Srinivas");
		list.add("dande");
		list.add("Anand");
		list.add("Kumar");
		System.out.println(list);
		//Copy One List to Another List
		List list2 = new ArrayList();
		list2.add("Java");
		list2.add("Jdbc");
		list2.add("Servlets");
		list2.add("JSP");
		System.out.println("list2: "+list2);
		Collections.copy(list2, list);
		System.out.println("list2 :"+list2);
	}

}
