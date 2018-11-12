package com.dharmu.jlc;

public class Cc3 {

	public static void main(String[] args) {
		int a=12321;
		int m=a;
		int rev=0;
		while(a>0) {
			int r=a%10;
			rev=(rev*10)+r;
			a=a/10;
		}
		if(rev==m)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
