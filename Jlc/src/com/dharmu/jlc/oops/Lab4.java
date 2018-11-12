package com.dharmu.jlc.oops;

public class Lab4 {

	public static void main(String[] args) {
		Hello33 h = new Hello33();
		int n=4;
		long fact = h.factorial(n);
		System.out.println("Factorial is: "+fact);

	}

}
class Hello33{
	long factorial(int n) {
		if(n==0 || n==1)
			return 1;
		else
			return n*factorial(n-1);
	}
}