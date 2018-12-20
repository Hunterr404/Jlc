package com.dharmu.jlc.iopackage;
import java.io.*;
public class Lab24 {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("D:\\info.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);){
			StudentB st = new StudentB(99,"Sri",65799999);
			StudentB.count=9;
			System.out.println(st);
			oos.writeObject(st);
			System.out.println("Object Serialized");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
class StudentB implements Serializable{
	int sid;
	transient String name = "XXXX";
	long phone = 333333;
	static int count = 3;
	StudentB(int sid,String name,long phone){
		this.sid=sid;
		this.name=name;
		this.phone=phone;
		
	}
	public String toString() {
		return sid+"\t"+name+"\t"+phone+"\t"+count;
		
	}
}
/*
 * Use Lab22 code to deserialize the object
*/