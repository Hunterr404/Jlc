package com.dharmu.jlc.multithreading;

public class Lab1K {

	public static void main(String[] args) {
		Hello3 h1 = new Hello3();
		Hello3 h2 = new Hello3();
		MyThread1K th1 = new MyThread1K(h1);
		MyThread1K th2 = new MyThread1K(h2);
		th1.start();
		th2.start();

	}

}
class MyThread1K extends Thread{
	Hello3 h = null;
	MyThread1K(Hello3 h){
		this.h=h;
	}
	public void run() {
		h.show();
	}
}
class Hello3{
	 static void show() {
		Thread th = Thread.currentThread();
		synchronized(Hello3.class) {
		for(int i=0;i<5;i++) {
				System.out.println(th.getName()+" - SHOW :"+i+"\t"+i);
				try {
					Thread.sleep(500);
				}catch(Exception e) {
					e.printStackTrace();
				}	
		}
			
			}
		}
	}