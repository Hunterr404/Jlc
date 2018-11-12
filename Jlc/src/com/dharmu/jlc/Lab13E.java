package com.dharmu.jlc;

public class Lab13E {

	public static void main(String[] args) {
		int a=0;
		if(a++==0)
			System.out.println("Zero");
		else if(a++==1)
			System.out.println("One");
		else
			System.out.println("Not Matching");
		System.out.println(a);
	}

}
