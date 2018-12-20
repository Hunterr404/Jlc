package com.dharmu.jlc.iopackage;
import java.io.*;
public class Lab4 {

	public static void main(String[] args) {
		try(InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);){
			System.out.println("Enter Id");
			String id = br.readLine();
			System.out.println("Enter Name");
			String nm = br.readLine();
			System.out.println(id+"\t"+nm);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
