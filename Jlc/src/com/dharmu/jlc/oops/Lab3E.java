package com.dharmu.jlc.oops;

public class Lab3E {

	public static void main(String[] args) {
		Hello22 h=new Hello22();
		//System.out.println(h.show());//The method show(int) in the type Hello22 is not applicable for the arguments ()
		//System.out.println(h.show(10,20));//The method show(int) in the type Hello22 is not applicable for the arguments (int, int)
		System.out.println(h.show(10));
		Hello23 h1=new Hello23();
		//h1.show1(12);//The method show1(byte) in the type Hello23 is not applicable for the arguments (int)
		byte b=12;
		h1.show1(b);
		h1.show1((byte)12);
		Hello24 h2= new Hello24();
		//h2.show2(65);//The method show2(char) in the type Hello24 is not applicable for the arguments (int)
		h2.show2('A');
		h2.show2((char)65);
	}

}
class Hello22{
	int show(int x) {
		System.out.println("show()");
		return x+1;
	}
}
class Hello23{
	void show1(byte x) {
		System.out.println("show(byte)");
		
	}
}
class Hello24{
	void show2(char x) {
		System.out.println("show(char)");
		
	}
}