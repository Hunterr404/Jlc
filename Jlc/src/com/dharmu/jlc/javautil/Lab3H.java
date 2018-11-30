package com.dharmu.jlc.javautil;

import java.util.*;


public class Lab3H {

	public static void main(String[] args) {
		System.out.println("\n --using generics with Set--");
		Set<String> set = new HashSet<String>();
		set.add("Srinivas");
		set.add("Manish");
		set.add("Dharmenra");
		set.add("Dannde");
		//set.add(new Integer(12));
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}

	}

}
