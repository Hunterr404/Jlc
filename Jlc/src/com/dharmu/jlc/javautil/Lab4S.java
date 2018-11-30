package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab4S {

	public static void main(String[] args) {
		System.out.println("About to Schedule Task");
		new Reminder(5);
		System.out.println("Task Scheduled");
	}

}
class Reminder{
	Timer timer;
	public Reminder(int seconds){
	timer = new Timer();
	timer.schedule(new RemindTask(), seconds*1000);
	}
	class RemindTask extends TimerTask{
		public void run() {
			System.out.println("Time's Up!!");
			timer.cancel();
		}
	}
}