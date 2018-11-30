package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab1R {

	public static void main(String[] args) {
		List list = new ArrayList();
		Iterator it = list.iterator();
		System.out.println(it.next());//java.util.NoSuchElementException
		System.out.println("Main Completed");
	}

}
