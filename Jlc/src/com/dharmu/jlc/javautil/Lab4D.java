package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab4D {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Srinivas");
		list.add("dande");
		list.add("Abhi");
		list.add("Kumar");
		list.add("Nivas");
		System.out.println(list);
		System.out.println("\n REVERSE");
		Collections.reverse(list);
		System.out.println(list);
		System.out.println("\n ROTATE");
		Collections.rotate(list, 2);
		System.out.println(list);
		System.out.println("\n Rotate(-3)");
		Collections.rotate(list, -3);
		System.out.println(list);
		System.out.println("\n Shuffle");
		for(int i=0;i<5;i++) {
			Collections.shuffle(list);
			System.out.println(list);
		}
		
	}

}
