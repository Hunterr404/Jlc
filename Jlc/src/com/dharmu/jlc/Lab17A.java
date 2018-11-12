package com.dharmu.jlc;

public class Lab17A {

	public static void main(String[] args) {
		int arr[];
		float arr2[];
		String names[];
		//arr3=new int[4];
		//arr4 = new float[5];
		//name = new String[4];
		//System.out.println(arr.length);
		//System.out.println(arr2.length);
		//System.out.println(names.length);
		/*int array[];
		array = new int[];
		System.out.println(array.length);
		*/
		int array1[];
		array1 = new int[3];
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println();
		array1[0] = 10;
		array1[1] =20;
		array1 [2] = 30;
		for(int i=0;i<array1.length;i++) 
			System.out.println(array1[i]);
	}

}
