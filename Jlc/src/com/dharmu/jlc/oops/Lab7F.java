package com.dharmu.jlc.oops;
abstract class Hello7B{
	int a;
	Hello7B(int a){
		this.a=a;
		System.out.println("Hello(int) Cons");
}
	{
		System.out.println("Hello I.B");
	}
	void show() {
		System.out.println("Hello Show()");
	}
}
class Hai7B extends Hello7B{//Must define an explicit constructor
	Hai7B(int a){
		super(a);
	}
}
public class Lab7F {

	public static void main(String[] args) {
		Hai7B hai=new Hai7B(10);
		hai.show();
	}

}
