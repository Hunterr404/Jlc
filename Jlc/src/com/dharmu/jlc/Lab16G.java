package com.dharmu.jlc;

public class Lab16G {

	public static void main(String[] args) {
		int a=10;
		/*if(a==10)
			continue;//Continue can't be used outside loop
			*/
		
		for(int i=0;i<10;i++) {
			System.out.println();
			continue;
			//System.out.println("After");//Unreachable Code, Statement after continue is ignored inside a loop*
		}
	}

}
