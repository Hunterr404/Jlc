package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab3A {

	public static void main(String[] args) {
		Map map = new LinkedHashMap();
		map.put("eid", Integer.valueOf(99));
		map.put("name", "Srinivas");
		map.put("phone", Long.valueOf(65799999));
		System.out.println("**Keys");
		Set keys = map.keySet();
		Iterator it = keys.iterator();
		while(it.hasNext()) {
			Object key = it.next();
			System.out.println(key);
		}
		System.out.println("**Values");
		Collection col = map.values();
		Iterator it1 =  col.iterator();
		while(it1.hasNext()) {
			Object val = it1.next();
			System.out.println(val);
		}
	}

}
