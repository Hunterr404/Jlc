package com.dharmu.jlc;

public class Lab18D {

	public static void main(String[] args) {
		int arr[][]= {{10,23,21},{12},{12,23,34,45},{98,34,32}};
		for(int ar[]:arr) {
			for(int a:ar)
				System.out.println("\t"+a);
			System.out.println();
		}
	}

}
