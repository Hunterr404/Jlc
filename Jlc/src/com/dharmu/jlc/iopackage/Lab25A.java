package com.dharmu.jlc.iopackage;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Lab25A {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("D:\\info.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);){
			Object obj = ois.readObject();//java.io.WriteAbortedException: writing aborted; java.io.NotSerializableException: com.dharmu.jlc.iopackage.Address
			System.out.println(obj);
			System.out.println("Object Deserialized");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
