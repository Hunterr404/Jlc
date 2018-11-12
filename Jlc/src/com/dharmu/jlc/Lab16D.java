package com.dharmu.jlc;

public class Lab16D {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=3;j++) {
				if(i==3)
					break;
				System.out.println(i+"\t"+j);
			}
		}
	}

}
