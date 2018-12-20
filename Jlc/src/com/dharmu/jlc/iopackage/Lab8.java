package com.dharmu.jlc.iopackage;
import java.io.*;
public class Lab8 {

	public static void main(String[] args) {
		try (InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				FileWriter fw = new FileWriter("D:\\D1\\stinfo.txt",true);
				BufferedWriter bwr = new BufferedWriter(fw);
				){
			char ch = 'Y';
			do {
				System.out.println("Enter Id : ");
				String id = br.readLine();
				System.out.println("Enter Name");
				String nm = br.readLine();
				String info = id+"\t"+nm;
				bwr.write(info);
				bwr.newLine();
				System.out.println("Do You want to add more:[Y/N]");
				ch = (char)br.readLine().charAt(0);
			}while(ch=='y');
			bwr.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
