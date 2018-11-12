package com.dharmu.jlc.oops;
abstract class Shape
{
	abstract void area();//The abstract method can only be defined by an abstract class
		//Abstract methods do not specify a body

}
class Square extends Shape{//abstract method must be overridden when extending
	void area() {
		System.out.println();
	}
}

public class Lab7B {

	public static void main(String[] args) {
		/*Shape sp=new Shape();//Cannot instantiate the type Shape
		sp.area();*/
		
	}

}
