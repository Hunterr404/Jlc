package com.dharmu.jlc.multithreading;
import java.util.*;
public class Lab1N {

	public static void main(String[] args) {
		Hello1N h1 = new Hello1N();
		MyThread1N th1 = new MyThread1N(h1);
		MyThread1N th2 = new MyThread1N(h1);
		th1.start();
		th2.start();

	}

}
class MyThread1N extends Thread{
	Hello1N h;
	MyThread1N (Hello1N h){
		this.h = h;
	}
	public void run() {
		h.show();
	}
}

class Hello1N{
	void show() {
		ArrayList al = new ArrayList();
		Thread th = Thread.currentThread();
		synchronized(al) {
			for(int i=0;i<5;i++) {
				try {
					//wait(1000);
					al.wait(1000);
					System.out.println(th.getName()+" - SHOW: "+i+"\t"+this);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}