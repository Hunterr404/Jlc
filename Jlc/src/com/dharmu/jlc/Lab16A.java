package com.dharmu.jlc;

public class Lab16A {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			if(i==5)
				break;
			System.out.println("**Inside Loop");
		}
		System.out.println("Outside Loop");
	}

}
