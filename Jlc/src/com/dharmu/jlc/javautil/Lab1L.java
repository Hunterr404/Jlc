package com.dharmu.jlc.javautil;

import java.util.ArrayList;
import java.util.List;

public class Lab1L {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");
		System.out.println(list);
		list.set(1, "Java");
		System.out.println(list);
		Object obj = list.get(2);
		System.out.println(obj);

	}

}
