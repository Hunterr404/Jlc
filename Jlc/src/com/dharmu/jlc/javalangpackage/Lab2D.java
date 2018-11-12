package com.dharmu.jlc.javalangpackage;

public class Lab2D {

	public static void main(String[] args)throws CloneNotSupportedException {
		Hai2D hai=new Hai2D(10);
		Hello2D h1 = new Hello2D(20,hai);
		Hello2D h2 = (Hello2D)h1.clone();
		System.out.println(h1==h2);
		System.out.println(h1.hai==h2.hai);
		h1.show();
		h2.show();
		h2.y=11;
		h2.hai.x=22;
		h1.show();
		h2.show();

	}

}
class Hai2D{
	int x;
	Hai2D(int x){
		this.x=x;
	}
}
class Hello2D implements Cloneable{
	int y;
	Hai2D hai;
	Hello2D(int y,Hai2D hai){
		this.y=y;
		this.hai=hai;
	}
	void show() {
		System.out.println("Hello-->y: "+y);
		System.out.println("Hai-->x: "+hai.x);
	}
	public Object clone() throws CloneNotSupportedException{
		if(this instanceof Cloneable) {
			Hai2D hai= new Hai2D(this.hai.x);
			Hello2D h=new Hello2D(this.y,hai);
			return h;
		}
		else 
			throw new CloneNotSupportedException(getClass().getName());
	}
}