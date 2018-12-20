package com.dharmu.jlc.iopackage;
import java.io.*;
public class Lab22 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("D:\\info.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);){
			Object obj = ois.readObject();//Student.class file is required created in the Last Example
			System.out.println("Object Deserialized");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
