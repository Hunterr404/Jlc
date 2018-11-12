package com.dharmu.jlc.oops;

public class Lab4I {

	public static void main(String[] args) {
		Hello43 h= new Hello43();
		h.show();

	}

}
/*class Hello42{
	//void show(int...arr1,int...arr2) {//The variable argument type int of the method show must be the last parameter
	void show(int...arr1,int...arr1) {	//Duplicate parameter arr1
	System.out.println("\nshow(int...,int...)");
	}
}*/
class Hello43{
	void show(int...arr) {
		System.out.println("\nshow(int...)");
	
	/*void show(int[] arr1) {//Duplicate method show(int[]) in type Hello43
		System.out.println("\nshow(int[]...");
	}*/
}
}