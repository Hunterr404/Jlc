package com.dharmu.jlc.javalangpackage;

public class Lab4M {

	public static void main(String[] args) {
		Runtime rt=null;
		//rt=new Runtime();
		System.out.println(Runtime.getRuntime());
		System.out.println(Runtime.getRuntime());
		rt = Runtime.getRuntime();
		System.out.println("A.P :"+rt.availableProcessors());
		System.out.println("M.M :"+rt.maxMemory());
		System.out.println("T M :"+rt.totalMemory());
		System.out.println("F M :"+rt.freeMemory());

	}

}
