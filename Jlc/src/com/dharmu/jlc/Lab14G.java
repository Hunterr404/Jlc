package com.dharmu.jlc;

public class Lab14G {

	public static void main(String[] args) {
		char ch='A';
		if (ch>=65 && ch<90) {
			switch(ch) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Character is vowel");
				break;
				default:
					System.out.println("Character is Consonant");
					
			}
		}else {
			System.out.println("Invalid Alphabet");
		}
	}

}
