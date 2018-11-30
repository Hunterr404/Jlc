package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab3B {

	public static void main(String[] args) {
		Map map = new LinkedHashMap();
		map.put("eid", Integer.valueOf(99));
		map.put("name", "Srinivas");
		map.put("phone", Long.valueOf(65799999));
		map.put("valid", Boolean.valueOf(true));
		System.out.println("**Keys and Values");
		Set data = map.entrySet();
		Iterator it = data.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Map.Entry entry = (Map.Entry)obj;
			Object key = entry.getKey();
			Object val = entry.getValue();
			System.out.println(key+"\t\t"+val);
			
		}

	}

}
