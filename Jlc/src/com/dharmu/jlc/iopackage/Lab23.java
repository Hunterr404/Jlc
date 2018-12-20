package com.dharmu.jlc.iopackage;
import java.io.*;
public class Lab23 {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("D:\\info.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);){
			Student st = new Student(99,"Sri",65799999);
			Student.count=9;
			oos.writeObject(st);
			System.out.println("Object Serialized");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
//class Person implements Serializable
class Person{
	int sid;
	String name = "XXXXX";
	long phone = 333333;
	
}
class StudentA extends Person implements Serializable{
	int sid;
	static int count = 3;
	StudentA(int sid,String name, long phone){
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