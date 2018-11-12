package com.dharmu.jlc.multithreading;

public class Lab1G {

	public static void main(String[] args) {
		MyThread1G th = new MyThread1G();
		Thread t1 = new Thread(th);
		System.out.println(t1.getState());
		t1.start();
		try{
			Thread.sleep(5000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(t1.getState());
		try{
			Thread.sleep(5000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(t1.getState());

	}

}
class MyThread1G extends Thread{
	public void run() {
		Thread th = Thread.currentThread();
		for(int i=0;i<10;i++) {
			System.out.println(th.getName()+" - value is: "+i+"\t"+th.getState());
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}