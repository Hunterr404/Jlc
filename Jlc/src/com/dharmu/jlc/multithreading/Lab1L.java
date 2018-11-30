 package com.dharmu.jlc.multithreading;

public class Lab1L {

	public static void main(String[] args) {
		Hello1L h1 = new Hello1L();
		MyThread1L th1 = new MyThread1L(h1);
		MyThread1L th2 = new MyThread1L(h1);
		th1.start();
		th2.start();
	}

}
class MyThread1L extends Thread{
	Hello1L h;
	MyThread1L(Hello1L h){
		this.h=h;
	}
	public void run() {
		h.show();
	}
}

class Hello1L{
	synchronized void show() {
		Thread th = Thread.currentThread();
		for(int i=0;i<5;i++) {
			try {
				wait(1000);
				//Thread.sleep(1000);
				System.out.println(th.getName()+" - Show: "+i+"\t"+this);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}