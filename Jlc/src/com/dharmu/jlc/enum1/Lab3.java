package com.dharmu.jlc.enum1;

public class Lab3 {

	public static void main(String[] args) {
		Direction3 arr[] = Direction3.values();
		for(Direction3 d:arr) {
			System.out.println(d.ordinal()+"\t"+d.name());
		}
		try {
			Direction3 d = Direction3.valueOf("east");
			System.out.println("**Direction found with the name");
		}catch(IllegalArgumentException ex) {
			System.out.println("**No Direction found with the name"); 
			
		}
		Direction3 d = Direction3.valueOf("EAST");
		System.out.println(d);
	}

}
enum Direction3{
	EAST(0), NORTH(90), WEST(180), SOUTH(270);
	int angle;
	Direction3(int angle){
		this.angle = angle;
		System.out.println("Direction() Def Cons**");
	}
	static {
		System.out.println("**static block in Direction3 class\n");
	}
	
}