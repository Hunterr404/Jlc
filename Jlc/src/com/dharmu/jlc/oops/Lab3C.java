package com.dharmu.jlc.oops;

public class Lab3C {

	public static void main(String[] args) {
		Hello12 h=new Hello12();
		int a=h.show(10);
		System.out.println(a);
		System.out.println(h.show(10));
		h.show(10);
		System.out.println("hello Guys");
		//Hello13 h=new Hello13(); //Duplicate local variable h
		Hello13 h1=new Hello13();
		//System.out.println(h1.show(10));
		/*Lab3C.java:6: error: 'void' type not allowed here
        System.out.println(h1.show(10));
        						^*/
	}

}
class Hello12{
	int show(int x) {
		return x+1;
	}
}
class Hello13{
	void show(int x) {
		System.out.println("show()");
		
	}
}
/*class Hello14{
	int show(int x) {  //This Method must return an int
		System.out.println("show()");
	}
}*/
/*class Hello15{
	int show(int x) {
		System.out.println("show()");
		return;//This method must return a result of type int
	}
}*/