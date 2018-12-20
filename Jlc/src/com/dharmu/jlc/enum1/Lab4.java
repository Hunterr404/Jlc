package com.dharmu.jlc.enum1;

public class Lab4 {

	public static void main(String[] args) {
		Direction4 d = Direction4.EAST;
		switch(d) {
		case EAST:
			System.out.println("East Direction Selected");
			break;
		case NORTH:
			System.out.println("NORTH Direction Selected");
			break;
		case WEST:
			System.out.println("WEST Direction Selected");
			break;
		case SOUTH:
			System.out.println("SOUTH Direction Selected");
			break;
		}
	}

}
enum Direction4{
	EAST,NORTH,WEST,SOUTH
}