package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab1P {

	public static void main(String[] args) {
		Vector v = new Vector();
		Enumeration enu = v.elements();
		if(enu.hasMoreElements())
			System.out.println(enu.nextElement());
		System.out.println("Main Completed");

	}

}
