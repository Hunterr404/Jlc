package com.dharmu.jlc.oops;

public class Lab4F {

	public static void main(String[] args) {
		Hello39 h = new Hello39();
		h.sum(new int[0]);
		h.sum(new int[] {12,34,54});
		h.sum(new int[] {10,20,50,30});
		h.sum();

	}

}
class Hello39{
	void sum(int...arr) {
		System.out.println("--Sum(int...)");
		System.out.println("length: "+arr.length);
		int s=0;
		for(int a:arr) 
			s=s+a;
		System.out.println("Sum is :"+s);
	}
}