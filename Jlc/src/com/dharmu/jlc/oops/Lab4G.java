package com.dharmu.jlc.oops;

public class Lab4G {

	public static void main(String[] args) {
		Hello40 h = new Hello40();
		//h.show();//The method show(int, int...) in the type Hello40 is not applicable for the arguments ()
		 h.show(10);
		 h.show(10, 20);
		 h.show(10, 20, 30);
	}

}
class Hello40{
	void show(int a,int...arr) {
		System.out.println("\nshow(int,int...)");
	}
}