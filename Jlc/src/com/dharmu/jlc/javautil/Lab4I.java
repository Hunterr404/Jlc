package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab4I {

	public static void main(String[] args) {
		int arr[] = new int[] {10,43,23,89,45};
		System.out.println("\n** Natural Order");
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"\t"+arr[i]);
		}
		System.out.println("\n**fill(int[],101");
		Arrays.fill(arr, 101);
		for(int i=0;i<arr.length;i++) 
			System.out.println(i+"\t"+arr[i]);
		Object values[] = new Object[5];
		values[0] = "Srinivas";
		values[1] = new Integer(123);
		values[2] = new Boolean(true);
		values[3] = new Long(99);
		values[4] = new Double(12.67);
		List list = Arrays.asList(values);
		System.out.println(list);
				
		
	}

}
