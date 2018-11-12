package com.dharmu.jlc.javalangpackage;

public class Lab2C {

	public static void main(String[] args) throws CloneNotSupportedException {
	Hai2C hai = new Hai2C(10);
	Hello2C h1=new Hello2C(20,hai);
	Hello2C h2=(Hello2C)h1.clone();
	h1.show();
	h2.show();
	System.out.println(h1==h2);
	System.out.println(h1.hai==h2.hai);
	h2.y=30;
	h1.show();
	h2.show();
	h2.hai.x=111;
	h1.show();
	h2.show();
	}

}
class Hai2C{
	int x;
	Hai2C(int x){
		this.x=x;
	}
}
class Hello2C implements Cloneable{
	int y;
	Hai2C hai;
	Hello2C(int y,Hai2C hai){
		this.y=y;
		this.hai=hai;
	}
	void show() {
		System.out.println("Hello-->y: "+y);
		System.out.println("Hai-->x: "+hai.x);
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}