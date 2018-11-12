package com.dharmu.jlc;

public class Lab17C {

	public static void main(String[] args) {
		int arr[] = new int[3];
		System.out.println("Len:"+ arr.length);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		System.out.println("-------------------------------");
		arr[0]=12; arr[1]=24; arr[2] = 37;
		for(int i=0; i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
