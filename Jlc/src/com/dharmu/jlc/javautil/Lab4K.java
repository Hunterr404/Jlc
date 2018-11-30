package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab4K {

	public static void main(String[] args) {
		int arr[] = new int[] {12,32,34};
		System.out.println("Len :"+arr.length);
		System.out.println(Arrays.toString(arr));
		arr = Arrays.copyOf(arr, 5);
		System.out.println("Len :"+arr.length);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
