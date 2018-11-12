package com.dharmu.jlc.multithreading;

public class Lab1E {

	public static void main(String[] args) {
		MyThread1E t1 = new MyThread1E();
		t1.setPriority(10);
		//t1.setPriority(0);//IllegalArgumentException
		//t1.setPriority(11);//IllegalArgumentException
		
		System.out.println(t1);

	}

}
class MyThread1E extends Thread{
	
}