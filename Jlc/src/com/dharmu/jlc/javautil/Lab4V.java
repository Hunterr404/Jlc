package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab4V {

	public static void main(String[] args) {
		Formatter fmt = new Formatter();
		String res = fmt.format("Sum of %d and %d is %d", 10,20,(10+20)).toString();
		System.out.println(res);
		fmt.close();
	}

}
