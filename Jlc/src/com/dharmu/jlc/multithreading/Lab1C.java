package com.dharmu.jlc.multithreading;

public class Lab1C {

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("WE");
		MyThread1C th1 = new MyThread1C(tg,"Jlc-Thread");
		MyThread1C th2 = new MyThread1C();
		th1.start();
		th2.start();

	}

}
class MyThread1C extends Thread{
	MyThread1C(ThreadGroup tg, String name){
		super(tg,name);
	}
	MyThread1C(){}
	public void run() {
		ThreadGroup tg = getThreadGroup();
		int pri = getPriority();
		for(int i=0;i<5;i++) {
			System.out.println(i+"\t"+getName()+"\t"+tg.getName()+"\t"+pri);
		}
	}
}
