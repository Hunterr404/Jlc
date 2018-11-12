package com.dharmu.jlc;

public class Lab17I {

	public static void main(String[] args) {
		int arr[]= {11,22,33};
		System.out.println("Len: "+arr.length);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		String names[] = {"Sri","Janab","Mr"};
		System.out.println("Len: "+names.length);
		for(int i=0;i<names.length;i++)
			System.out.println(names[i]);
		int arr1[] = {};
		System.out.println("Array Length "+arr1.length);
		for(int i=0;i<arr1.length;i++)
			System.out.println("Array Values "+arr[i]);
		int arr2[] = null;
		arr2 = new int[] {91,81,71,61};
		for(int i=0;i<arr2.length;i++)
			System.out.println(arr2[i]);
		show(new int[] {23,53,74,97});
		//show(new int[4] {21,25,32,38});
	}
	static void show(int arr[]) {
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[0]);
	}

}
