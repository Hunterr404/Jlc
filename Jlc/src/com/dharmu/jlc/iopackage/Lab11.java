package com.dharmu.jlc.iopackage;
import java.io.*;
public class Lab11 {

	public static void main(String[] args) {
		File file = new File("D:\\Angrezi Films\\");
		File files[] = file.listFiles();
		for(File f:files) {
			System.out.println(f+"\t\t\t --> isFile :"+f.isFile()+" , isDir:"+f.isDirectory());
		}
	}

}
