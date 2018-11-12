package com.dharmu.jlc;

public class Lab17H {

	public static void main(String[] args) {
		int arr[] = new int[0];
		System.out.println(arr.length);
		int ar[] = new int[3];
		System.out.println(ar.length);
		final int ar1[] = new int[3];
		System.out.println("Length is: "+ar1.length);
		System.out.println(ar1[0]);
		System.out.println(ar1[1]);
		ar1[0] =94;
		ar1[1] = 71;
		System.out.println(ar1[0]);
		System.out.println(ar1[1]);
		/*
		 * //arr2=new int[5];
		//arr2 = null;
		//ar.length=32;
		//System.out.println(ar.length);
		//int arr1[] = new int[-1];
		//System.out.println(arr1.length);
		int arr2[] = new int[1];
		System.out.println("Length:"+arr2.length);
		int arr3[] = null;
		System.out.println("Len:"+arr3.length);
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		*/
	}

}
