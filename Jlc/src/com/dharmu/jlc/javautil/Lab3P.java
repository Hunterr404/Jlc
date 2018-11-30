package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab3P {

	public static void main(String[] args) {
		int []values = {1,5,3,7,6,9,8};
		int len = values.length;
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
		for(int x:values)
			pq1.offer(x);
		System.out.println();
	
	System.out.println(pq1);
	for(int i=0;i<len;i++) 
		System.out.println(pq1.poll()+"");
		String nms[] = {"Sri","Nivas","Kumar","dande","Rahul"}; 
		int len2  = nms.length;
		PriorityQueue<String>pq2 = new PriorityQueue<String>();
		for(String x:nms)
			pq2.offer(x);
		System.out.println(pq2);
		for(int i=0;i<len2;i++)
			System.out.println(pq2.poll()+"");
	

}	

}
