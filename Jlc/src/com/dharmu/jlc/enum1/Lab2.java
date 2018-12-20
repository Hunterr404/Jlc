package com.dharmu.jlc.enum1;

public class Lab2 {

	public static void main(String[] args) {
		Direction2 d1 = null;
		//d1 = new Direction2(0);//Cannot instantiate the type Direction2
		d1 = Direction2.EAST;
		System.out.println(d1);
		System.out.println(Direction2.NORTH);
		System.out.println(Direction2.WEST);
		System.out.println(Direction2.SOUTH);
	}

}
enum Direction2{
	EAST, NORTH, WEST, SOUTH;
	Direction2(){
		System.out.println("Direction() Def Cons**");
	}
	static {
		System.out.println("**static block in Direction2 enum");
	}
}