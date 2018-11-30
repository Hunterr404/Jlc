package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab1D {

	public static void main(String[] args) {
	Collection col = new ArrayList();
	col.add("Sri");
	col.add("Srinivas");
	col.add("dande");
	Object arr[]=col.toArray();
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		arr[i]="JLC";
		System.out.println(arr[i]);
		
	}
	System.out.println("\n\n");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);

	}
	System.out.println(col);
	}

}
