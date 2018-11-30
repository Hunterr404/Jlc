package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab1F {

	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add("Sri");
		col.add("Srinivas");
		col.add("Dande");
		System.out.println(col);
		Iterator it = col.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
			if(obj.equals("Sri"))
				it.remove();
		}
		System.out.println(col);
	}

}
