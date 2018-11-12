package com.dharmu.jlc;

public class Lab16 {

	public static void main(String[] args) {
		char ch='A';
		int rows=0;
		do {
			int cols=0;
			do {
				System.out.print(ch+" ");
				cols++;
			}while(cols<=rows);
			System.out.println();
			rows++;
		}while(rows<8);

	}

}
