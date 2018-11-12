package com.dharmu.jlc.oops;

public class Lab3F {

	public static void main(String[] args) {
		Hello26 h= new Hello26();
		int a=h.add(10, 20);
		System.out.println(a);
		int b=h.add(10, 20, 30);
		System.out.println(b); 
	}

}/*
class Hello25{
	int add(int a,int b) {
		System.out.println("add(int,int)");
		return a+b;
	}
void add(int a, int b) {
	System.out.println("add(int,int)");
}
}//Duplicate method add(int, int) in type Hello25*/
class Hello26{
	int add(int a,int b) {
		System.out.println("add(int,int)");
		return a+b;
	}
int add(int a, int b,int c) {
	System.out.println("add(int,int)");
	return a+b+c;
}
}