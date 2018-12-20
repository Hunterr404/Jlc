package com.dharmu.jlc.enum1;

public class Lab5 {

	public static void main(String[] args) {
		Direction5.EAST.show();
		Direction5.WEST.show();
		Direction5.NORTH.show();
		Direction5.SOUTH.show();
	}

}
enum Direction5{
	EAST(){
		void show() {
			System.out.println("Showing East Direction");
		}
	},NORTH{
		void show() {
			System.out.println("Showing North Direction");
		}
	},WEST{
		void show() {
			System.out.println("Showing West Direction");
		}
	},SOUTH{
		void show() {
			System.out.println("Showing South Direction");
		}
	};
	abstract void show();
	
}