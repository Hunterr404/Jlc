package com.dharmu.jlc.oops;

public class Lab6B {

	public static void main(String[] args) {
		A6B aobj=new A6B(98);
		System.out.println(aobj.getX());
		aobj.setX(123);
		System.out.println(aobj.getX());
	}

}
class A6B{
	private int x;
	A6B(int x){
		this.x=x;
	}
		public void setX(int x) {
		this.x=x;	
		}
		public int getX() {
			return this.x;
		}
	}
