package com.dharmu.jlc.iopackage;
import java.io.*;
public class Lab19 {

	public static void main(String[] args) throws Exception{
		File f1 = new File("Sri");
		File f2 = new File(f1,"jlc\\io");
		f2.mkdirs();
		System.out.println("Directory io inside jlc, and jlc inside Sri Created");
		File f3 = new File(f2,"Hai.txt");
		System.out.println("f3.getName()\t"+f3.getName());
		f3.createNewFile();
		System.out.println("File Hi.txt Created sri\\jlc\\io");
		
	}

}
