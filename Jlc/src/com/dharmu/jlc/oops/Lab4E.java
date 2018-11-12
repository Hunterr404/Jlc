package com.dharmu.jlc.oops;

public class Lab4E {

	public static void main(String[] args) {
		Hello38 h= new Hello38();
		h.sum(new int[0]);
		h.sum(new int [] {12,34,54});
		//h.sum();//The method sum(int[]) in the type Hello38 is not applicable for the arguments ()
		//h.sum(12,34,54);//The method sum(int[]) in the type Hello38 is not applicable for the arguments (int, int, int)
		//h.sum(10,20,50,30);//The method sum(int[]) in the type Hello38 is not applicable for the arguments (int, int, int, int)
		//h.sum(null);//java.lang.NullPointerException
	}

}
class Hello38{
	void sum(int arr[]) {
		System.out.println("--Sum(int[])");
		System.out.println("Length: "+arr.length);
		int s=0;
		for(int a:arr)
			s=s+a;
		System.out.println("Sum is :"+s);
	}
}