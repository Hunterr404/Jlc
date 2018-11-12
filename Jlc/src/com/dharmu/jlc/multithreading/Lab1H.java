package com.dharmu.jlc.multithreading;

public class Lab1H {

	public static void main(String[] args) {
		Hello h1 = new Hello();
		Hello h2 = new Hello();
		MyThread1H th1 = new MyThread1H(h1);
		MyThread1H th2 = new MyThread1H(h1);
		//MyThread1H th3 = new MyThread1H(h2);
		th1.start();
		th2.start();
	}

}
class MyThread1H extends Thread{
	Hello h=null;
	MyThread1H(Hello h){
		this.h=h;
	}
	public void run() {
		h.show();
	}
}
class Hello{
	synchronized void show() {
		Thread th = Thread.currentThread();
		for(int i=0;i<5;i++) {
			System.out.println(th.getName()+" - SHOW:"+i+"\t"+this);
			try {
					Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}