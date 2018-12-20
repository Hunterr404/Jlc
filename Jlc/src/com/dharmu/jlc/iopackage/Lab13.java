package com.dharmu.jlc.iopackage;
import java.io.*;
public class Lab13 {

	public static void main(String[] args) {
		File file = new File("D:\\D1\\JAVA");
		System.out.println("Dir FOund : "+file.exists());
		file.mkdirs();
		System.out.println("Dir Found :"+file.exists()); 
		
	}

}
