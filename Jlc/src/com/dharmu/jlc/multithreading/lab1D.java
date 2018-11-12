package com.dharmu.jlc.multithreading;

public class lab1D {

	public static void main(String[] args) {
		ThreadGroup tg= new ThreadGroup("WE");
		MyThread1D mth = new MyThread1D();
		Thread th1 = new Thread(tg,mth,"Jlc-Thread");
		Thread th2 = new Thread(mth);
		th1.start();
		th2.start();

	}

}
class MyThread1D implements Runnable{
	public void run() {
		Thread th = Thread.currentThread();
		ThreadGroup tg = th.getThreadGroup();
		int pri = th.getPriority();
		for(int i=0;i<5;i++) {
			System.out.println(i+"\t"+th.getName()+"\t"+tg.getName()+"\t"+pri);
		}
	}
}