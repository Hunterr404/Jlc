package com.dharmu.jlc.iopackage;
import java.io.*;
public class Lab18 {

	public static void main(String[] args)throws Exception {
		File f = new File("d:\\hello.txt");
		f.createNewFile();
		f.deleteOnExit();
		File f2 = new File("hi.txt");
		f2.createNewFile();
		System.out.println("f2.isHidden()\t"+f2.isHidden());
		System.out.println("f2.delete()\t"+f2.delete());
		System.out.println("File Created");
		File f3 = new File("C:\\ProgramData");
		System.out.println("f3.isHidden()\t"+f3.isHidden());

	}

}
