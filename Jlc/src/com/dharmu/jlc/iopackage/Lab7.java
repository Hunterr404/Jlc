package com.dharmu.jlc.iopackage;
import java.io.*;
public class Lab7 {

	public static void main(String[] args) {
		try(FileReader fis = new FileReader("D:\\D1\\abc.txt");
				BufferedReader br = new BufferedReader(fis);
				FileWriter fw = new FileWriter("D:\\D1\\xyz.txt");
				BufferedWriter bwr = new BufferedWriter(fw);){
			while(true) {
				String st = br.readLine();
				if(st==null) break;
				bwr.write(st);
				bwr.newLine();
			}bwr.close();
			System.out.println("Writing Completed");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
