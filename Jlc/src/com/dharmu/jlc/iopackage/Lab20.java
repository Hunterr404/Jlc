package com.dharmu.jlc.iopackage;
import java.io.*;
public class Lab20 {

	public static void main(String[] args) throws IOException{
		File f = new File("sri\\jlc\\io");
		f.mkdirs();
		File f1 = new File(f,"jlc.txt");
		System.out.println("f1.getName()\t"+f1.getName());
		System.out.println("Before Creating f1.exists()\t"+f1.exists());
		f1.createNewFile();
		System.out.println("file hi.txt Created sri\\jlc\\io");
		System.out.println("f1.getAbsolutePath()\t"+f1.getAbsolutePath());
		System.out.println("f1.getParent()\t"+f1.getParent());
		System.out.println("f1.getPath()\t"+f1.getPath());
		System.out.println("After Creating f1.exists()\t"+f1.exists());
		System.out.println("f1.canRead()\t"+f1.canRead());
		System.out.println("f1.canWrite()\t"+f1.canWrite());
		File f2 = new File("Hello.txt");
		f2.createNewFile();
		System.out.println("f2.getAbsolutePath()\t"+f2.getAbsolutePath());
		System.out.println("f2.getParent()\t"+f2.getParent());
		System.out.println("f2.getPath()\t"+f2.getPath());
	}

}
