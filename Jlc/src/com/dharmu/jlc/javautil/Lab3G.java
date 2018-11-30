package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab3G {

	public static void main(String[] args) {
		System.out.println("\n --using generics with list--");
		List<String> list = new ArrayList<String>();
		list.add("Srinivas");
		list.add("Manish");
		list.add("Dharmenra");
		list.add("Dannde");
		//list.add(new Integer(12));
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}

	}

}
