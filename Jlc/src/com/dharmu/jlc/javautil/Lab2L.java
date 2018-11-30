package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab2L {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Employee());// java.lang.ClassCastException--Employee cannot be cast to class java.lang.Comparable
		ts.add(new Employee());
		ts.add(new Employee());
		ts.add(new Employee());
	}

}
class Employee{
	
}