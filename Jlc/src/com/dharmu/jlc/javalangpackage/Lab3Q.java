package com.dharmu.jlc.javalangpackage;

public class Lab3Q {

	public static void main(String[] args) {
		String exp="[A-Z]";
		System.out.println("H".matches(exp));
		System.out.println("S".matches(exp));
		System.out.println("HI".matches(exp));
		System.out.println("\n");
		
		String exp1="[A-Z]*";
		System.out.println("S".matches(exp1));
		System.out.println("HI".matches(exp1));
		System.out.println("SRINIVAS".matches(exp1));
		System.out.println("JLCINDIA".matches(exp1));
		System.out.println("jlc".matches(exp1));
		System.out.println("\n");
		
		
		String exp2="[A-Z a-z 0-9]*";
		System.out.println("jlc".matches(exp2));
		System.out.println("JLCindia99".matches(exp2));
		System.out.println("99JLCindia".matches(exp2));
		System.out.println("\n");
		
		String exp3="^[A-Z][A_Z a-z 0-9]*";
		System.out.println("jlc".matches(exp3));
		System.out.println("JLCindia99".matches(exp3));
		System.out.println("99JLCindia".matches(exp3));

	}

}
