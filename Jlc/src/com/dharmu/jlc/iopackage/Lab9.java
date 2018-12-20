package com.dharmu.jlc.iopackage;
import java.io.*;
public class Lab9 {

	public static void main(String[] args) throws Exception{
		PrintWriter pw = new PrintWriter("Welcome.txt");
		pw.println(97);
		pw.write(97);
		pw.println(10.0);
		pw.println(true);
		pw.println("JLC");
		pw.close();
	}

}
