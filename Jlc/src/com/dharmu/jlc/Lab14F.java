package com.dharmu.jlc;

public class Lab14F {

	public static void main(String[] args) {
		int a=10;
		final int x=20;
		switch(a) {
		case 10:
			System.out.println("Ten");
			break;
		case x:
			System.out.println("Twenty");
			break;
		case 'A':
			System.out.println("CHAR -A");
			break;
		case 10+20+15:
			System.out.println("Constant expression");
		break;
		default:
			System.out.println("Default");
		}
	}

}
