package com.dharmu.jlc.multithreading;

public class Lab1A {

	public static void main(String[] args) {
		MyThread t1 = new  MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();
		Thread t = Thread.currentThread();
		for(int i=100;i<110;i++) {
			System.out.println(t.getName()+" - Value is : "+i);
			try {
				Thread.sleep(1500);
				
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}

	}

}
class MyThread extends Thread{
	public void run() {
		Thread th = Thread.currentThread();
		for(int i=1;i<10;i++) {
			System.out.println(th.getName()+"  - Value is: "+i);
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}