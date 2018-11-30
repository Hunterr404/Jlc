package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab3 {

	public static void main(String[] args) {
		Map map = new LinkedHashMap();
		System.out.println(map);
		System.out.println("Size :"+map.size());
		System.out.println("IS EMPTY:"+map.isEmpty());
		map.put("eid", new Integer(99));
		map.put("name", "Srinivas");
		map.put("phone", Long.valueOf(65799999L));
		map.put("valid", new Boolean(true));
		System.out.println(map);
		System.out.println("Map Size :"+ map.size());
		System.out.println("US EMPTY :"+map.isEmpty());
		
		System.out.println(map.containsKey("eid"));
		System.out.println(map.containsKey("email"));
		System.out.println(map.containsKey("Srinivas"));
		System.out.println(map.containsKey(new Integer(99)));
		System.out.println(map.containsKey("SD"));
		
		System.out.println(map);
		System.out.println("Remove eid" + map.remove("eid"));
		System.out.println(map);
		System.out.println("put - Phone :"+ map.put("phone ", new Long(31903290L)));
		System.out.println(map);
		System.out.println("get()");
		System.out.println(map.get("name"));
		System.out.println(map.get("email"));

	}

}
