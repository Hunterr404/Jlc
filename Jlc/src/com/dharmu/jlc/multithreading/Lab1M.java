package com.dharmu.jlc.multithreading;
import java.util.*;
public class Lab1M {

	public static void main(String[] args) {
		Hello1M h1 = new Hello1M();
		MyThread1M th1 = new MyThread1M(h1);
		MyThread1M th2 = new MyThread1M(h1);
		th1.start();
		th2.start();

	}

}
class MyThread1M extends Thread{
	Hello1M h;
	MyThread1M(Hello1M h){
		this.h=h;
	}
	public void run() {
		h.show();
	}
}
class Hello1M{
	synchronized void show() {
		ArrayList al = new ArrayList();
		Thread th = Thread.currentThread();
		for(int i=0; i<5;i++) {
			try {
				wait(1000);
				//al.wait(1000);//IllegalMonitorStateException
				System.out.println(th.getName()+" - SHOW: "+i+"\t"+this);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}