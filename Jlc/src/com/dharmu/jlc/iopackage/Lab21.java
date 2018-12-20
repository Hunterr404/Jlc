package com.dharmu.jlc.iopackage;
import java.io.*;
public class Lab21 {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("D:\\info.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);){
			Student st = new Student(99,"Sri",65799999);
			Student.count=9;
			System.out.println(st);
			oos.writeObject(st);
			System.out.println("Object Serialized");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
				
	}

}
class Student implements Serializable{
	int sid;
	String name;
	long phone;
	static int count = 3;
	Student(int sid,String name,long phone){
		this.sid=sid;
		this.name=name;
		this.phone=phone;
		
	}public String toString() {
		return sid+"\t"+name+"\t"+phone+"\t"+count;
	}
}