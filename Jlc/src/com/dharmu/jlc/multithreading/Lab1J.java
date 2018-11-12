package com.dharmu.jlc.multithreading;

public class Lab1J {

	public static void main(String[] args) {
		Hello2 h1 = new Hello2();
		Hello2 h2 = new Hello2();
		MyThread1J th1 = new MyThread1J(h1);
		MyThread1J th2 = new MyThread1J(h2);
		th1.start();
		th2.start();

	}

}
class MyThread1J extends Thread{
	Hello2 h = null;
	MyThread1J(Hello2 h){
		this.h=h;
	}
	public void run() {
		h.show();
	}
}
class Hello2{
	synchronized static void show() {
		Thread th = Thread.currentThread();
		
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
