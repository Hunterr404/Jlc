package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab4E {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Srinivas");
		list.add("dande");
		list.add("Abhi");
		list.add("Kumar");
		list.add("Nivas");
		System.out.println(list);
		System.out.println("\n Sorting in ASCENDING");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("\n Sorting in DESCENDING");
		Collections.sort(list, new StringDescComp());
		System.out.println(list);

	}

}
class StringDescComp implements Comparator{
	public int compare(Object obj1, Object obj2) {
	String s1 = obj1.toString();
	String s2 = obj2.toString();
	return s2.compareTo(s1);
	}
}