package com.dharmu.jlc;

public class Lab16C {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.println("\n"+ i);
			for(int j=1;j<=5;j++,System.out.print("j++")) {
				if(i==3)break;
				System.out.println("Jlc"+j);
			}
		}
	}

}
