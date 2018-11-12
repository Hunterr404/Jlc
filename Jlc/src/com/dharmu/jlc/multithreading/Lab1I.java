package com.dharmu.jlc.multithreading;

public class Lab1I {

	public static void main(String[] args) {
		Hello1 h1 = new Hello1();
		Hello1 h2 = new Hello1();
		MyThread1I th1 = new MyThread1I(h1);
		MyThread1I th2 = new MyThread1I(h1);
		//MyThread1I th3 = new MyThread1I(h2);
		th1.start();
		th2.start();

	}

}
class MyThread1I extends Thread{
	Hello1 h = null;
	MyThread1I(Hello1 h){
		this.h=h;
	}
	public void run() {
		h.show();
	}
}
class Hello1{
	void show() {
		Thread th = Thread.currentThread();
		synchronized(this) {
			for(int i=0;i<5;i++) {
				System.out.println(th.getName()+" - SHOW :"+i+"\t"+this);
				try {
					Thread.sleep(500);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}