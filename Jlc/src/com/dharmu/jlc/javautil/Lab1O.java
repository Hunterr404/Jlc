package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab1O {

	public static void main(String[] args) {
		Vector v = new Vector();
		Enumeration enu = v.elements();
		System.out.println(enu.nextElement());//java.util.NoSuchElementException
		System.out.println("Main Completed");

	}

}
