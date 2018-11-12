package com.dharmu.jlc.oops;

public class Lab6E {

	public static void main(String[] args) {
		Hai6E hai=new Hai6E();
		hai.m1();

	}

}
class Hello6E{
	A6E m1() {
		return new A6E();
	}
}
/*class Hai6E extends Hello6E{
	B6E m1() {// The return type is incompatible with Hello6E.m1()
		 
		return new B6E();
	}
}*/
class Hai6E extends Hello6E{
	A6E m1() {
		return new A6E();
	}
}
class Hai6EB extends Hello6E{
	B6E m1() {
		return new B6E();
	}
}
class A6E{}
class B6E extends A6E{}