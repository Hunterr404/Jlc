package com.dharmu.jlc.iopackage;

import java.io.File;

public class Lab14 {

	public static void main(String[] args) throws Exception {
		File file = new File("D:\\D1\\JAVA\\Hello.java");
		System.out.println("File FOund : "+file.exists());
		file.createNewFile();
		System.out.println("File Found :"+file.exists()); 
	}

}
