package com.dharmu.jlc.oops;

public class Lab3D {

	public static void main(String[] args) {
		Hello17 h=new Hello17();
		System.out.println(h.show1(10));
		Hello18 h1=new Hello18();
		System.out.println(h1.show2(10));
		Hello19 h2=new Hello19();
		System.out.println(h2.show3(10));
		Hello21 h3=new Hello21();
		System.out.println(h3.isDigit('A'));
		System.out.println(h3.isDigit('8'));
	}

}
/*class Hello16{
	int show(int x) {
		System.out.println("show()");
		return 12L;//Type mismatch: cannot convert from long to int(Incompatiable Type)
	}
}*/
class Hello17{
	long show1(int x) {
		System.out.println("show()");
		return 'A';
	}
}
class Hello18{
	long show2(int x) {
		System.out.println("show()");
		return x+1;
	}
}
class Hello19{
	boolean show3(int x) {
		System.out.println("show()");
		return true;
	}
}
/*class Hello20{
	boolean show4(int x) {
		System.out.println("show()");
		return 0;//Type mismatch: cannot convert from int to boolean
	}
}*/
class Hello21{
	boolean isDigit(char ch) {
		System.out.println("isDigit()");
		if(ch>=48 && ch<=57)
			return true;
		else
			return false;
	}
}
		
		
		