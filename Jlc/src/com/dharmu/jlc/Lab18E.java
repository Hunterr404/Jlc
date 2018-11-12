package com.dharmu.jlc;

public class Lab18E {

	public static void main(String[] args) {
		int arr[][]=null;
		arr=new int[][] {{11,21,31},{12},{13,56,45,43},{98,57,79}};
			for(int ar[]:arr) {
				for(int a:ar)
				System.out.println("\t"+a);
				System.out.println();
			}
	}

}
