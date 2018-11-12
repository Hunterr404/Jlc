package com.dharmu.jlc.oops;

public class Lab6D {

	public static void main(String[] args) {
		B6D bobj=new B6D();
		bobj.show(99);
		bobj.show("JLC");

	}

}
class A6D{
	void show(int ab) {
		System.out.println("A --show(int)");
	}
}
class B6D extends A6D{
	void show(String ab) {
		System.out.println("B--> show(String)");
	}
}
class A6DA{
	long show() {
		return 0;
	}
}
/*class A6DB extends A6DA{
	int show() {//The return type is incompatible with  A6DA.show()
		return 0;
	}
}*/