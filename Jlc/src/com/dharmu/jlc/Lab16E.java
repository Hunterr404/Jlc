package com.dharmu.jlc;

public class Lab16E {

	public static void main(String[] args) {
		JLC:
			for(int i=0;i<=5;i++) {
				for(int j=1;j<=3;j++) {
					if(i==3)
						break JLC;
					System.out.println(i+"\t"+j);
				}
			}
	}

}
