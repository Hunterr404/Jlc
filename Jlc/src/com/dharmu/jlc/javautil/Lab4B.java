package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab4B {

	public static void main(String[] args) {
		Set s = Collections.singleton("JLC");
		System.out.println(s);
		//s.add("HELLO");//java.lang.UnsupportedOperationException
		
		List list = Collections.singletonList("JLC");
		System.out.println(list);
		//list.add("HELLO");//java.lang.UnsupportedOperationException
		
	}

}
