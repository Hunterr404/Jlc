package com.dharmu.jlc.oops;

public class Lab3B {

	public static void main(String[] args) {
		Operation.showRemainder(10, 4);
		Operation.showRemainder(10, 0);
		Operation1.showRemainder(10, 4);
		Operation1.showRemainder(10, 4);
		Operation2.showRemainder(10, 4);
		Operation2.showRemainder(10, 0);
	}

}
/*class Student8{
		show(){  //Invalid Method declaration- Return type for the method is missing
		System.out.println("show()");
	}
}*/
class Operation{
	static void showRemainder(int a,int b) {
		System.out.println(a%b);
	}
}

class Operation1{
	static void showRemainder(int a,int b) {
		if(b==0);
		return;
		//System.out.println(a%b);  //Unreachable Code
	}
}
class Operation2{
	static void showRemainder(int a,int b) {
		if(b==0) {
			//return 0; // Void methods cannot return a value
			System.out.println(a%b);
		}
	}
}