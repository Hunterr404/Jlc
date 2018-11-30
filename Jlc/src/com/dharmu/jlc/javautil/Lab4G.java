package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab4G {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Srinivas");
		list.add("dande");
		list.add("Abhi");
		list.add("Kumar");
		list.add("Nivas");
		System.out.println(list);
		
		List synlist = Collections.synchronizedList(list);
		System.out.println("synch \t"+synlist);
		System.out.println("list \t"+list);
		List unModi = Collections.unmodifiableList(list);
		System.out.println("unModi \t"+unModi);
		System.out.println("\n**MODIFYING LIST");
		list.add("Manish");
		System.out.println("\n list"+list);
		System.out.println("un Modi\t"+unModi);
		//unModi.add("JLCINDIA");//java.lang.UnsupportedOperationException
		
	}

}
