package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab1B {

	public static void main(String[] args) {
		Collection col = new ArrayList();
		System.out.println(col);
		System.out.println("Size "+ col.size());;
		System.out.println("Empty :"+col.isEmpty());
		System.out.println();
		col.add("sri");
		col.add("nivas");
		col.add("srini");
		col.add("SD");
		col.add("dande");
		System.out.println(col);
		System.out.println("Size :"+col.size());
		System.out.println("Empty :"+col.isEmpty());
		}

}
