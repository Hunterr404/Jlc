package com.dharmu.jlc;

public class Lab14B {

	public static void main(String[] args) {
		Course c=Course.CORE;
		switch(c) {
		case ADV:
			System.out.println("100% Placement Guarantee");
		case CORE:
			System.out.println("Placement is not guaranteed");
		}

	}
	
	enum Course{
		CORE,ADV
	}
}
