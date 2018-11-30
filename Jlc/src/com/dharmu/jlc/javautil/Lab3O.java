package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab3O {

	public static void main(String[] args) {
		Queue<Stud> que = new PriorityQueue<Stud>();
		que.add(new Stud());//java.lang.ClassCastException
		que.add(new Stud());
		System.out.println("Main Completed");
	}

}
class Stud{
	
}