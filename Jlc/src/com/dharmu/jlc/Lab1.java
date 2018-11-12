package com.dharmu.jlc;

public class Lab1 {
	char ch;
	int a=99;

	void show() {
		System.out.println(ch==0);
		System.out.println(ch==' ');
		System.out.println(ch=='\u0000');
	}
	public static void main(String[] args) {
		Lab1 l=new Lab1();
		l.show();

	}

}
