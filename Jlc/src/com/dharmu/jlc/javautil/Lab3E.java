package com.dharmu.jlc.javautil;

import java.util.*;

public class Lab3E {

	public static void main(String[] args) {
		System.out.println("\n**TreeMap");
		Map map = new TreeMap();
		map.put("sid", "JLC-099");
		map.put("name", "Sri");
		map.put("email", "sri@jlc.com");
		map.put("phone", "65799999");
		map.put("add", "Mathikere");
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext())
			System.out.println(it.next());

	
	}

}
