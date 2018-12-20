package com.dharmu.jlc.iopackage;
import java.io.*;
public class Lab12 {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\dHARMU\\Desktop\\New folder\\Java src\\java.base\\java\\lang");
		File javaFiles[] = file.listFiles(new ExtFilter( ".java"));
		System.out.println("**Java Files**");
		if(javaFiles!=null)
			for(File f:javaFiles)
				System.out.println(f);
		else
			System.out.println("No Java Files Found");
		
	}

}
class ExtFilter implements FileFilter{
	String ext;
	public ExtFilter(String ext) {
		this.ext = ext;
	}
	public boolean accept(File f) {
		return f.getName().endsWith(ext);
	}
}