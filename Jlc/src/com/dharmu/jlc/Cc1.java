package com.dharmu.jlc;

public class Cc1 {

	public static void main(String[] args) {
		int count=0;
		int num = Integer.parseInt(args[0]);//Accepts Command Line Input
		for(int i=2; i<num/2;i++) {
			if(num%i==0)
				count++;
			
			
			
			
			
		}
		if(count==0) 
			System.out.println("Prime Number");
			else
				System.out.println("Not Prime");
		
	}

}
