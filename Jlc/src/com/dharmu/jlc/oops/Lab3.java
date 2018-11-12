package com.dharmu.jlc.oops;

public class Lab3 {

	public static void main(String[] args) {
		/*Hello6 h=null;// Causes Null Pointer Exception
		h.show();*/
		/*h=new hello();
		h.show();*/
		//Hello6.show();//Cannot make a static reference to the non-static method show() from the type Hello6
		
		Hello7 h2=null;
		h2.show();
		h2=new Hello7();
		h2.show();
		Hello7.show();
		
		Hello8 h=new Hello8();
		h.show();
		
	}

}
class Hello6{
	void show() {
		System.out.println("Instance Show() ");
	}
}

class Hello7{
	static void show() {
		System.out.println("Static show()");
	}
	
}

class Hello8{
	int a;
	static int b;
	void show() {
		System.out.println(a);
		System.out.println(b);
		
	}
	
	/*class Hello9{
		int a;
		static int c;
		static void show() {
			//System.out.println(a);//Cannot make a static reference to the non-static field 
			System.out.println(c);
		}
	}*/
}