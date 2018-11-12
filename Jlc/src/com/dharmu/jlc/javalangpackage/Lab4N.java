package com.dharmu.jlc.javalangpackage;

public class Lab4N {

	public static void main(String[] args) throws Exception{
		Runtime rt = Runtime.getRuntime();
		Process p = rt.exec("mspaint");
		String cmds[]= {"notepad","D:\\wecome.txt"};
		Process p2 = rt.exec(cmds);
		
		String cmds1[] = {"C:\\Program Files\\Mozilla Firefox\\firefox.exe","http://news.google.com"}; 
		Process p3 = rt.exec(cmds1);
		
		System.out.println("Press Enter to close all process");
		System.in.read();
		p.destroy();
		p2.destroy();
		p3.destroy();
		System.out.println("Main Completed");
	}

}
